package com.service;
import java.util.Date;
import java.util.List;

import com.vo.Order;
import com.vo.Paihaolist;
import com.vo.Shop;
import com.vo.Shopphoto;
import com.vo.Sq;
import com.vo.User;
public interface GlyService {
public int getwclnumber();
public List<Shop> getallweishenhe();
public List<Sq> getallwei();
public Shopphoto sp(String soname);
public User getglymessage(String userid);
public void tongguoshenqing(int shopnumber,int adminno,Date nowtime);
public void jujueshenqing(int shopnumber,int adminno,Date nowtime);
public void add0(Paihaolist paihaolist);
public void add00(int sellerno);
public List<User> getallxiaofeizhe();
public List<User> getallshangpuzhuren();
public int huoqvxiadancishu(int buyerid);
public List<Order> getzijiorder3(int orderno);
public List<Shop> getallshangpu();
public List<Order> getzijiorder4(int sellerno);
public int huoqvshoudancishu(int sellerid);
}
