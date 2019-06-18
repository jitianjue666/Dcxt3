package com.service;

import java.util.Date;
import java.util.List;

import com.vo.Coupon;
import com.vo.Couponlist;
import com.vo.Dish;
import com.vo.Order;
import com.vo.Paihaolist;
import com.vo.Shouru;
import com.vo.User;

public interface SellService {
public void xiadan(Order order);
public int huoqvxzdhao(int shopid);
public void kaishipaihao(int shopid,int buyerid,int paihao,int ordernumber);
public int wwcdds(int shopid);
public int getorderno(int sellerno);
public int getweiwanchengordernumber(int sellerno);
public List<Integer> getwwcordernumber(int sellerno);
public List<Order> getwwcdd(int orderno,int sellerno);
public List<Integer> getzijiorder(int buyerno);
public List<Order> getzijiallorder(int orderno,int buyerno);
public String getshopname(int shopno);
public void kucunjianyi(int dishid,int number);
public List<Order> qwerty(int orderno,int sellerno);
public void over1(int dishid,int num);
public void over2(int orderno,Date overtime,int sellerno);
public void over3(int shopno);
public void over4(int ordernumber,int sellerid);
public int qmhydsr(int buyerno);
public void tianjiahongbao(Coupon coupon);
public List<Coupon> getbendiancoupon(int spid);
public Coupon getgaicoupon(int couponid);
public List<User> getallguke();
public void fafang1(Couponlist couponlist);
public List<Paihaolist> getlaiguodekehu(int sellerid);
public List<Couponlist> getzijihongbao(int uuie);
public List<Couponlist> getzijibendianhongbao(int uuie,String sna);
public void shanchu1(int uuie,int cid);
public List<Couponlist> getzijibendiankeyonghongbao(int uuie,String sna,double fromm);
public void tianjiajilu(Shouru shouru);
public Shouru getone(int dingdanhao,int sno);
public List<Integer> getzijiorder2(int sellerno);
public List<Order> getzijiallorder2(int orderno,int sellerno);
public List<Order> getzijiorder4(int sellerno);
public List<Dish> getalldish4(int shopid);
public int getsjs();
public void charusjs(int sjs);
}
