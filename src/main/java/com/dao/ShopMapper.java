package com.dao;

import com.vo.Shop;
import com.vo.ShopExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ShopMapper {
    long countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer shopno);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer shopno);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    public void shopshenqing(Shop shop);
    public int getno(String shopname);
    public int getmount();
    public List<Shop> getalldaishenhe();
    public void updatetime(@Param("shopadopttime")Date shopadopttime,@Param("shopno")int shopno);
    public void updatestate(int shopno);
    public void updatestate2(int shopno);
    public void updatevolume(int shopno);
    public Shop panduanzhuangtai(int ownerno);
    public List<Shop> getsuoyoushangdian();
    public List<Shop> getsuoyoushangdian1();
    public List<Shop> getsuoyoushangdian2();
    public List<Shop> getsuoyoushangdian3();
    public List<Shop> getsuoyoushangdian4();
    public List<Shop> getsuoyoushangdian5();
    public List<Shop> getsuoyoushangdian6();
    public String getshopname(int shopno);
    public void over3(int shopno);
    public Shop  shifouexist(int ownerno);
    public List<Shop> getallshangpu();
    public Shop getonlyoneshop(int shopno);
    public int shanchushangjia(int shopno);
}