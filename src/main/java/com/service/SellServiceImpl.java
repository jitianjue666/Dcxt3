package com.service;

import java.util.Date;
import java.util.List;

import com.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vo.Coupon;
import com.vo.Couponlist;
import com.vo.Dish;
import com.vo.Order;
import com.vo.Paihaolist;
import com.vo.Shouru;
import com.vo.User;
@Service
public class SellServiceImpl implements SellService {
@Autowired
OrderMapper ordermapper;
@Autowired
ShouruMapper shourumapper;
@Autowired
UserMapper usermapper;
@Autowired
CouponMapper couponmapper;
@Autowired
CouponlistMapper couponlistmapper;
@Autowired
DishMapper dishmapper;
@Autowired
ShopMapper shopmapper;
	@Autowired
	SjsMapper sjsmapper;
@Autowired
PaihaolistMapper paihaolistmapper;
	@Override
	public void xiadan(Order order) {
		ordermapper.xiadan(order);

	}
	@Override
	public int huoqvxzdhao(int shopid) {
		int paihao=paihaolistmapper.huoqvxzdehao(shopid);

		return paihaolistmapper.huoqvxzdehao(shopid);
	}
	@Override
	public void kaishipaihao(int shopid, int buyerid, int paihao,int ordernumber) {
		paihaolistmapper.kaishipaihao(buyerid, shopid, paihao,ordernumber);
		
	}
	@Override
	public int wwcdds(int shopid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.weiwancdingdanshu(shopid);
	}
	@Override
	public int getorderno(int sellerno) {

		return ordermapper.getordernumber(sellerno);
	}
	@Override
	public int getweiwanchengordernumber(int sellerno) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Order> getwwcdd(int orderno, int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.getwwcddxx(orderno, sellerno);
	}
	@Override
	public List<Integer> getwwcordernumber(int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.getwwcordernumber(sellerno);
	}
	@Override
	public List<Integer> getzijiorder(int buyerno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiorder(buyerno);
	}
	@Override
	public List<Order> getzijiallorder(int orderno, int buyerno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiallorder(orderno, buyerno);
	}
	@Override
	public String getshopname(int shopno) {
		// TODO Auto-generated method stub
		return shopmapper.getshopname(shopno);
	}
	@Override
	public void kucunjianyi(int dishid,int number) {
		// TODO Auto-generated method stub
		dishmapper.kucunjianyi(dishid,number);
	}

	public List<Order> qwerty(int orderno,int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.qwerty(orderno,sellerno);
	}
	@Override
	public void over1(int dishid, int num) {
		// TODO Auto-generated method stub
		dishmapper.over1(dishid, num);
	}
	@Override
	public void over2(int orderno, Date overtime,int sellerno) {
		// TODO Auto-generated method stub
		ordermapper.over2(orderno, overtime,sellerno);
	}
	@Override
	public void over3(int shopno) {
		// TODO Auto-generated method stub
		shopmapper.over3(shopno);
	}
	@Override
	public void over4(int ordernumber,int sellerid) {
		// TODO Auto-generated method stub
		paihaolistmapper.over4(ordernumber,sellerid);
	}
	@Override
	public int qmhydsr(int buyerno) {
		// TODO Auto-generated method stub
		return paihaolistmapper.qianmianhaiyouduoshaoren(buyerno);
	}
	@Override
	public void tianjiahongbao(Coupon coupon) {
		// TODO Auto-generated method stub
		couponmapper.tianjiahongbao(coupon);
	}
	@Override
	public List<Coupon> getbendiancoupon(int spid) {
		// TODO Auto-generated method stub
		return couponmapper.getbendiancoupon(spid);
	}
	@Override
	public Coupon getgaicoupon(int couponid) {
		// TODO Auto-generated method stub
		return couponmapper.getgaicoupon(couponid);
	}
	@Override
	public List<User> getallguke() {
		// TODO Auto-generated method stub
		return usermapper.getallguke();
	}
	@Override
	public void fafang1(Couponlist couponlist) {
		couponlistmapper.fafang1(couponlist);
		
	}
	@Override
	public List<Paihaolist> getlaiguodekehu(int sellerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.laiguodekehu(sellerid);
	}
	@Override
	public List<Couponlist> getzijihongbao(int uuie) {
		// TODO Auto-generated method stub
		return couponlistmapper.getzijihongbao(uuie);
	}
	@Override
	public List<Couponlist> getzijibendianhongbao(int uuie, String sna) {
		// TODO Auto-generated method stub
		return couponlistmapper.getzijibendiangongbao(uuie, sna);
	}
	@Override
	public void shanchu1(int uuie, int cid) {
		// TODO Auto-generated method stub
		couponlistmapper.shanchu1(uuie, cid);
	}
	@Override
	public List<Couponlist> getzijibendiankeyonghongbao(int uuie, String sna, double fromm) {
		// TODO Auto-generated method stub
		return couponlistmapper.getzijibendiankeyonghongbao(uuie, sna, fromm);
	}
	@Override
	public void tianjiajilu(Shouru shouru) {
		// TODO Auto-generated method stub
		shourumapper.tianjiajilu(shouru);
	}
	@Override
	public Shouru getone(int dingdanhao,int sno) {
		// TODO Auto-generated method stub
		return shourumapper.getone(dingdanhao,sno);
	}

	public List<Integer> getzijiorder2(int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiorder2(sellerno);
	}

	public List<Order> getzijiallorder2(int orderno, int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiallorder2(orderno, sellerno);
	}

	public List<Order> getzijiorder4(int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiorder4(sellerno);
	}

	public List<Dish> getalldish4(int shopid) {
		// TODO Auto-generated method stub
		return dishmapper.getalldish4(shopid);
	}
	public int getsjs(){return sjsmapper.getsjs();};
	public void charusjs(int sjs){ sjsmapper.charusjs(sjs);};
}
