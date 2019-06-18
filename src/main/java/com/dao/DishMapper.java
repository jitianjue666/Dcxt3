package com.dao;

import com.vo.Dish;
import com.vo.DishExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DishMapper {
    long countByExample(DishExample example);

    int deleteByExample(DishExample example);

    int deleteByPrimaryKey(Integer dishid);

    int insert(Dish record);

    int insertSelective(Dish record);

    List<Dish> selectByExample(DishExample example);

    Dish selectByPrimaryKey(Integer dishid);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
    public void xinzengcaipin(Dish dish);
    public int getid(@Param("shopid")int shopid,@Param("dishname")String dishname);
    public  List<Map<String,Object>> listdish(int shopid);
    public void xgcp(@Param("dishid")int dishid,@Param("dishname")String dishname,@Param("dishintroduction")String dishintroduction,@Param("dishprice")double dishprice,@Param("dishstock")int dishstock);
    public List<Dish> getalldish(int shopid);
    public List<Dish> getalldishphoto(int shopid);
    public List<Dish> getalldish2(@Param("shopid")int shopid,@Param("dishcategory")String dishcategory);
    public List<Dish> getalldish3(@Param("shopid")int shopid);
    public int getdishguishu(int dishid);
    public String idgetmingzi(int dishid);
    public double getprice(int dishid);
    public void kucunjianyi(@Param("dishid")int dishid,@Param("number")int number);
    public void over1(@Param("dishid")int dishid,@Param("num")int num);
    public String caipintuijian2(int dishid);
    public int caipintuijian3(@Param("dishid")int dishid,@Param("dishcategory")String dishcategory);
    public int caipintuijian4(int dishid);
    public Dish getonlydish(int dishid);
    public List<Dish> getalldish4(int shopid);
    
}