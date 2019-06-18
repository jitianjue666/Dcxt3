package com.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vo.Cptj1;
import com.vo.Dish;
import com.vo.Dishcategory;
import com.vo.Dishphoto;
import com.vo.Shop;
import com.vo.Shopapply;
import com.vo.Shopphoto;
import com.vo.Shtj1;

public interface ShopService {
public void spsq(Shop shop);
public int getno(String shopname);
public void spsq2(Shopphoto shopphoto,MultipartFile picture) throws Exception;
public void spsq3(Shopapply shopapply);
public void spsq4(Shopphoto shopphoto);
public Shop panduanzhuangtai(int ownerno);
public Shopphoto sp2(int sno);
public void xinzengcaipinfenlei(Dishcategory dishcategory);
public List<Dishcategory> getallcategory(int shopshopno);
public void shanchucaipinfenlei(int shopshopno,String dcategory);
public void xinzengcaipin(Dish dish);
public int getdishid(int shopid,String dishname);
public void caiptp(Dishphoto dishphoto,MultipartFile picture)throws Exception;
public List<Map<String, Object>> listdish(int shopid);
public void xgcp(int shopid,String dishname,String dishintroduction,double dishprice,int dishstock);
public List<Dish> getalldish(int shopid);
public Dishphoto getdishtp(int did);
public void xgcptp(int did,byte[] dphoto,MultipartFile picture) throws IOException;
public List<Dish> getalldishphoto(int shopid);
public List<Shop> getallshop();
public List<Shop> getallshop1();
public List<Shop> getallshop2();
public List<Shop> getallshop3();
public List<Shop> getallshop4();
public List<Shop> getallshop5();
public List<Shop> getallshop6();
public List<Dish> getalldish2(int shopid,String dishcategory);
public List<Dish> getalldish3(int shopid);
public int getdishguishu(int dishid);
public String idgetname(int dishid);
public double getdishprice(int dishid);
public List<Shtj1> shangjiatuijian1(int buyerid);
public int shangjiatuijian2(int buyerid,int sellerid);
public int shangjiatuijian3(int buyerid,int sellerid);
public int shangjiatuijian4(int buyerid,int sellerid);
public Shop getonlyshop(int shopno);
public List<Cptj1> caipintuijian1(int buyerno);
public String caipintuijian2(int dishid);
public int caipintuijian3(@Param("dishid")int dishid,@Param("dishcategory")String dishcategory);
public int caipintuijian4(int dishid);
public Dish getonlydish(int dishid);
public int sahnchushangjia(int shopno);
}
