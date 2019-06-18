package com.service;

import java.util.Date;
import java.util.List;

import com.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vo.Order;
import com.vo.Paihaolist;
import com.vo.Shop;
import com.vo.Shopphoto;
import com.vo.Sq;
import com.vo.User;

@Service
public class GlyServiceImpl implements GlyService {
	@Autowired
	ShopMapper shopmapper;
	@Autowired
	OrderMapper ordermapper;
	@Autowired
	ShopapplyMapper shopapplymapper;
	@Autowired
	ShopphotoMapper shopphotomapper;
	@Autowired
	SqMapper sqmapper;
	@Autowired
	UserMapper usermapper;
	@Autowired
	PaihaolistMapper paihaolistmapper;

	public int getwclnumber() {
		
		return shopmapper.getmount();
	}

	public List<Shop> getallweishenhe() {
		
		return shopmapper.getalldaishenhe();
	}

	public List<Sq> getallwei() {
		
		return sqmapper.getallwei();
		}

	public Shopphoto sp(String soname) {
		// TODO Auto-generated method stub
		return shopphotomapper.sp(soname);
	}

	public User getglymessage(String userid) {
		// TODO Auto-generated method stub
		return usermapper.getglymessage(userid);
	}

	public void tongguoshenqing(int shopnumber, int adminno, Date nowtime) {
		shopmapper.updatevolume(shopnumber);
		shopmapper.updatestate(shopnumber);
		shopmapper.updatetime(nowtime, shopnumber);
		shopapplymapper.updateadminno(shopnumber, adminno);
		shopapplymapper.updateapstate(shopnumber);
		shopapplymapper.updatedealtime(shopnumber, nowtime);
		}

	public void jujueshenqing(int shopnumber, int adminno, Date nowtime) {
//		shopmapper.updatevolume(shopnumber);
//		shopmapper.updatestate2(shopnumber);
//		shopmapper.updatetime(nowtime, shopnumber);
//		shopapplymapper.updateadminno(shopnumber, adminno);
//		shopapplymapper.updateapstate2(shopnumber);
//		shopapplymapper.updatedealtime(shopnumber, nowtime);
		System.out.println("************************");
		System.out.println(nowtime);
	}

	public void add0(Paihaolist paihaolist) {
		// TODO Auto-generated method stub
		paihaolistmapper.add0(paihaolist);
	}

	public void add00(int sellerno) {
		// TODO Auto-generated method stub
		ordermapper.add00(sellerno);
	}

	public List<User> getallxiaofeizhe() {
		// TODO Auto-generated method stub
		return usermapper.getallxiaofeizhe();
	}

	public List<User> getallshangpuzhuren() {
		// TODO Auto-generated method stub
		return usermapper.getallshangpuzhuren();
	}

	public int huoqvxiadancishu(int buyerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.huoqvxiadancishu(buyerid);
	}

	public List<Order> getzijiorder3(int orderno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiorder3(orderno);
	}

	public List<Shop> getallshangpu() {
		// TODO Auto-generated method stub
		return shopmapper.getallshangpu();
	}

	public List<Order> getzijiorder4(int sellerno) {
		// TODO Auto-generated method stub
		return ordermapper.getzijiorder4(sellerno);
	}

	public int huoqvshoudancishu(int sellerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.huoqvshoudancishu(sellerid);
	}

}
