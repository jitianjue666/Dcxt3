package com.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dao.DishMapper;
import com.dao.DishcategoryMapper;
import com.dao.DishphotoMapper;
import com.dao.OrderMapper;
import com.dao.PaihaolistMapper;
import com.dao.ShopMapper;
import com.dao.ShopapplyMapper;
import com.dao.ShopphotoMapper;
import com.vo.Cptj1;
import com.vo.Dish;
import com.vo.Dishcategory;
import com.vo.Dishphoto;
import com.vo.Shop;
import com.vo.Shopapply;
import com.vo.Shopphoto;
import com.vo.Shtj1;
@Service
public class ShopServiceImpl implements ShopService {
@Autowired
ShopMapper shopmapper;
@Autowired
OrderMapper ordermapper;
@Autowired
ShopphotoMapper shopphotomapper;
@Autowired
ShopapplyMapper shopapplymapper;
@Autowired
DishcategoryMapper dishcategorymapper;
@Autowired
DishMapper dishmapper;
@Autowired
DishphotoMapper dishphotomapper;
@Autowired
PaihaolistMapper paihaolistmapper;

	@Override
	public void spsq(Shop shop) {
		shopmapper.shopshenqing(shop);

	}

	@Override
	public int getno(String shopname) {
		// TODO Auto-generated method stub
		return shopmapper.getno(shopname);
	}

	@Override
	public void spsq2(Shopphoto shopphoto,MultipartFile picture) throws Exception{
		byte[] b1 = picture.getBytes();
		  shopphoto.setSphoto(b1);
		System.out.println(b1.length+"***************");
		shopphotomapper.shangpushenqing2(shopphoto);
	}

	@Override
	public void spsq3(Shopapply shopapply) {
		// TODO Auto-generated method stub
		shopapplymapper.shopshenqing3(shopapply);
	}

	@Override
	public void spsq4(Shopphoto shopphoto) {
		shopphotomapper.shangpushenqing4(shopphoto);
		
	}

	@Override
	public Shop panduanzhuangtai(int ownerno) {
		// TODO Auto-generated method stub
		return shopmapper.panduanzhuangtai(ownerno);
	}

	@Override
	public Shopphoto sp2(int sno) {
		// TODO Auto-generated method stub
		return shopphotomapper.sp2(sno);
	}

	@Override
	public void xinzengcaipinfenlei(Dishcategory dishcategory) {
		dishcategorymapper.xinzengcaipinfenlei(dishcategory);
		
	}

	@Override
	public List<Dishcategory> getallcategory(int shopshopno) {
		// TODO Auto-generated method stub
		return dishcategorymapper.getallcategory(shopshopno);
	}

	@Override
	public void shanchucaipinfenlei(int shopshopno, String dcategory) {
	dishcategorymapper.shanchucaipinfenlei(shopshopno, dcategory);
		
	}

	@Override
	public void xinzengcaipin(Dish dish) {
		dishmapper.xinzengcaipin(dish);
		
	}

	@Override
	public int getdishid(int shopid, String dishname) {
		// TODO Auto-generated method stub
		return dishmapper.getid(shopid, dishname);
	}

	@Override
	public void caiptp(Dishphoto dishphoto, MultipartFile picture) throws Exception {
		byte[] b1 = picture.getBytes();
		  dishphoto.setDphoto(b1);
		System.out.println(b1.length+"***************");
         dishphotomapper.caipintupian(dishphoto);
		
	}

	@Override
	public List<Map<String, Object>> listdish(int shopid) {
		// TODO Auto-generated method stub
		return dishmapper.listdish(shopid);
	}

	@Override
	public void xgcp(int shopid, String dishname, String dishintroduction, double dishprice, int dishstock) {
		dishmapper.xgcp(shopid, dishname, dishintroduction, dishprice, dishstock);
		
	}

	@Override
	public List<Dish> getalldish(int shopid) {
	
		return dishmapper.getalldish(shopid);
	}

	@Override
	public Dishphoto getdishtp(int did) {
		// TODO Auto-generated method stub
		return dishphotomapper.gettp(did);
	}

	@Override
	public void xgcptp(int did, byte[] dphoto, MultipartFile picture) throws IOException {
		byte[] b1 = picture.getBytes();
		  dphoto=b1;
		System.out.println(b1.length+"***************");
       dishphotomapper.xgcptp(did, dphoto);
		
	}

	@Override
	public List<Dish> getalldishphoto(int shopid) {
		// TODO Auto-generated method stub
		return dishmapper.getalldishphoto(shopid);
	}

	@Override
	public List<Shop> getallshop() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian();
	}

	@Override
	public List<Dish> getalldish2(int shopid, String dishcategory) {
		// TODO Auto-generated method stub
		return dishmapper.getalldish2(shopid, dishcategory)
				;
	}

	@Override
	public List<Dish> getalldish3(int shopid) {
		// TODO Auto-generated method stub
		return dishmapper.getalldish3(shopid);
	}

	@Override
	public int getdishguishu(int dishid) {
		// TODO Auto-generated method stub
		return dishmapper.getdishguishu(dishid);
	}

	@Override
	public String idgetname(int dishid) {
		// TODO Auto-generated method stub
		return dishmapper.idgetmingzi(dishid);
	}

	@Override
	public double getdishprice(int dishid) {
		// TODO Auto-generated method stub
		return dishmapper.getprice(dishid);
	}

	@Override
	public List<Shop> getallshop1() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian1();
	}
	@Override
	public List<Shop> getallshop2() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian2();
	}
	@Override
	public List<Shop> getallshop3() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian3();
	}
	@Override
	public List<Shop> getallshop4() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian4();
	}
	@Override
	public List<Shop> getallshop5() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian5();
	}
	@Override
	public List<Shop> getallshop6() {
		// TODO Auto-generated method stub
		return shopmapper.getsuoyoushangdian6();
	}

	@Override
	public List<Shtj1> shangjiatuijian1(int buyerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.shangjiatuijian1(buyerid);
	}

	@Override
	public int shangjiatuijian2(int buyerid, int sellerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.shangjiatuijian2(buyerid, sellerid);
	}

	@Override
	public int shangjiatuijian3(int buyerid, int sellerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.shangjiatuijian3(buyerid, sellerid);
	}

	@Override
	public int shangjiatuijian4(int buyerid, int sellerid) {
		// TODO Auto-generated method stub
		return paihaolistmapper.shangjiatuijian4(buyerid, sellerid);
	}

	@Override
	public Shop getonlyshop(int shopno) {
		// TODO Auto-generated method stub
		return shopmapper.getonlyoneshop(shopno);
	}

	@Override
	public List<Cptj1> caipintuijian1(int buyerno) {
		// TODO Auto-generated method stub
		return ordermapper.caipintuijian1(buyerno);
	}

	@Override
	public String caipintuijian2(int dishid) {
		// TODO Auto-generated method stub
		return dishmapper.caipintuijian2(dishid);
	}

	@Override
	public int caipintuijian3(int dishid, String dishcategory) {
		// TODO Auto-generated method stub
		return dishmapper.caipintuijian3(dishid, dishcategory);
	}

	@Override
	public int caipintuijian4(int dishid) {
		// TODO Auto-generated method stub
		return dishmapper.caipintuijian4(dishid);
	}

	@Override
	public Dish getonlydish(int dishid) {
		// TODO Auto-generated method stub
		return dishmapper.getonlydish(dishid);
	}

	@Override
	public int sahnchushangjia(int shopno) {
		// TODO Auto-generated method stub
		return shopmapper.shanchushangjia(shopno);
	}

}
