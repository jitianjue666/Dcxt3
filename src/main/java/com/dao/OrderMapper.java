package com.dao;

import com.vo.Cptj1;
import com.vo.Order;
import com.vo.OrderExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
    public void xiadan(Order order);
    public void add00(int sellerno);
    public int getordernumber(int sellerno);
    public List<Integer> getwwcordernumber(int sellerno);
   public List<Order> getwwcddxx(@Param("orderno")int orderno,@Param("sellerno")int sellerno);
   public List<Integer> getzijiorder(int buyerno);
   public List<Order> getzijiallorder(@Param("orderno")int orderno,@Param("buyerno")int buyerno);
   public List<Order> qwerty(@Param("orderno")int orderno,@Param("sellerno")int sellerno);
   public void over2(@Param("orderno")int orderno,@Param("overtime")Date overtime,@Param("sellerno")int sellerno);
   public List<Integer> getzijiorder2(int sellerno);
   public List<Order> getzijiallorder2(@Param("orderno")int orderno,@Param("sellerno")int sellerno);
   public List<Order> getzijiorder3(int orderno);
   public List<Order> getzijiorder4(int sellerno);
   public List<Cptj1> caipintuijian1(int buyerno);
   
}