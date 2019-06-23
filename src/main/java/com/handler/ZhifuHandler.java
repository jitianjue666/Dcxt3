package com.handler;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.alipay.config.AlipayConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.service.GlyService;
import com.service.SellService;
import com.service.ShopService;
import com.service.UserService;

@Controller
public class ZhifuHandler
{
	@Autowired
	GlyService glyservice;
	@Autowired
	ShopService shopservice;
	@Autowired
	UserService userservice;
	@Autowired
	SellService sellservice;

	@ResponseBody
	@RequestMapping(value = "/goAlipay", produces = "text/html; charset=UTF-8")
	public String goAlipay(Model m,HttpServletRequest request, HttpServletRequest response,HttpSession session) throws Exception {
 //Shouru shouru=(Shouru) session.getAttribute("shouru");
		//Orders order = orderService.getOrderById(orderId);
 
		//Product product = productService.getProductById(order.getProductId());
 String dianming=(String) session.getAttribute("dianming");
 double qian=(Double) session.getAttribute("qian");
 int ddh=(Integer) session.getAttribute("ddh");
 //获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
 
		//设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
 int sjs=sellservice.getsjs()+1;
		//商户订单号，商户网站订单系统中唯一订单号，必填
		// out_trade_no = String.valueOf(shouru.getDingdanhao());
		String out_trade_no = String.valueOf(sjs);
		sellservice.charusjs(sjs);
		//付款金额，必填
		//String total_amount = String.valueOf(shouru.getXianjia());
		DecimalFormat df = new DecimalFormat("#.00");
		 String wer=df.format(qian);
		String total_amount = String.valueOf(wer);
		//订单名称，必填
		//String subject = String.valueOf(shouru.getDianjiaid());
		String subject = String.valueOf(ddh);
 
		// 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
    	String timeout_express = "1c";
 
		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
				+ "\"total_amount\":\""+ total_amount +"\","
				+ "\"subject\":\""+ subject +"\","
				+ "\"timeout_express\":\""+ timeout_express +"\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
 
		//请求
		System.out.println("5555555555");
		System.out.println("66666666666666{\"out_trade_no\":\""+ out_trade_no +"\","
				+ "\"total_amount\":\""+ total_amount +"\","
				+ "\"subject\":\""+ subject +"\","
				+ "\"timeout_express\":\""+ timeout_express +"\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		int hao=(Integer) session.getAttribute("hao");
		int hao2=(Integer) session.getAttribute("hao2");
		m.addAttribute("hao",hao);
		m.addAttribute("hao2",hao2);
		m.addAttribute("qian",qian);
		session.setAttribute("hao",hao);
		session.setAttribute("hao2",hao2);
		session.setAttribute("qian",qian);
		System.out.println("店名"+dianming);
		System.out.println("订单号"+ddh);
		System.out.println("钱"+qian);
		return result;
	}
 
	/**
	 * @Description: 支付宝同步通知页面
	 */
	@RequestMapping(value = "/alipayReturnNotice.action")
	public ModelAndView alipayReturnNotice(Model m,HttpServletRequest request, HttpServletRequest response,HttpSession session) throws Exception {
 
		System.out.println("支付成功, 进入同步通知接口...");
 
		//获取支付宝GET过来反馈信息
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			String valueStr2 = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
 
		boolean signVerified = false;
		try{
			signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
		}catch (Exception e) {
			System.out.println("SDK验证签名出现异常");
		}
 
		ModelAndView mv = new ModelAndView("jiaohao");
		//——请在这里编写您的程序（以下代码仅作参考）——
		if(signVerified) {
			//商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
 
			//支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
 
			//付款金额
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
 
			// 修改叮当状态，改为 支付成功，已付款; 同时新增支付流水
			//orderService.updateOrderStatus(out_trade_no, trade_no, total_amount);
 
 
			//Orders order = orderService.getOrderById(out_trade_no);
			//Product product = productService.getProductById(order.getProductId());
 
			System.out.println("********************** 支付成功(支付宝同步通知) **********************");
			System.out.println("* 订单号: {}"+out_trade_no);
			System.out.println("* 支付宝交易号: {}"+trade_no);
			System.out.println("* 实付金额: {}"+total_amount);
			
			System.out.println("***************************************************************");
 
 
    		mv.addObject("out_trade_no", out_trade_no);
    		mv.addObject("trade_no", trade_no);
    		mv.addObject("total_amount", total_amount);
    		
 
		}else {
			System.out.println("支付, 验签失败...");
		}
		int hao=(Integer) session.getAttribute("hao");
		int hao2=(Integer) session.getAttribute("hao2");
		double qian=(Double) session.getAttribute("qian");
		m.addAttribute("hao",hao);
		m.addAttribute("hao2",hao2);
		m.addAttribute("qian",qian);
		return mv;
	}
 
	/**
	 * @Description: 支付宝异步 通知页面
	 */
	@RequestMapping(value = "/alipayNotifyNotice")
	@ResponseBody
	public String alipayNotifyNotice(Model m,HttpServletRequest request, HttpServletRequest response,HttpSession session) throws Exception {
 
		System.out.println("支付成功, 进入异步通知接口...");
 
		//获取支付宝POST过来反馈信息
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用
//			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
 
		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
 
		//——请在这里编写您的程序（以下代码仅作参考）——
		
		/* 实际验证过程建议商户务必添加以下校验：
		1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
		2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
		3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
		4、验证app_id是否为该商户本身。
		*/
		if(signVerified) {//验证成功
			//商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
 
			//支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
 
			//交易状态
			String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"),"UTF-8");
 
			//付款金额
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
 
			if(trade_status.equals("TRADE_FINISHED")){
				//判断该笔订单是否在商户网站中已经做过处理
				//如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
				//如果有做过处理，不执行商户的业务程序
 
				//注意： 尚自习的订单没有退款功能, 这个条件判断是进不来的, 所以此处不必写代码
				//退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
			}else if (trade_status.equals("TRADE_SUCCESS")){
				//判断该笔订单是否在商户网站中已经做过处理
				//如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
				//如果有做过处理，不执行商户的业务程序
 
				//注意：
				//付款完成后，支付宝系统发送该交易状态通知
 
				// 修改叮当状态，改为 支付成功，已付款; 同时新增支付流水
				//orderService.updateOrderStatus(out_trade_no, trade_no, total_amount);
 
				//Orders order = orderService.getOrderById(out_trade_no);
				//Product product = productService.getProductById(order.getProductId());
 
				System.out.println("********************** 支付成功(支付宝异步通知) **********************");
				System.out.println("* 订单号: {}"+out_trade_no);
				System.out.println("* 支付宝交易号: {}"+trade_no);
				System.out.println("* 实付金额: {}"+total_amount);
				System.out.println("***************************************************************");
			}
			System.out.println("支付成功...");
 
		}else {//验证失败
			System.out.println("支付, 验签失败...");
		}
		int hao=(Integer) session.getAttribute("hao");
		int hao2=(Integer) session.getAttribute("hao2");
		double qian=(Double) session.getAttribute("qian");
		m.addAttribute("hao",hao);
		m.addAttribute("hao2",hao2);
		m.addAttribute("qian",qian);
		return "jiaohao";
	}

}
