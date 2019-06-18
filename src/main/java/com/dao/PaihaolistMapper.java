package com.dao;

import com.vo.Paihaolist;
import com.vo.PaihaolistExample;
import com.vo.Shtj1;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaihaolistMapper {
    long countByExample(PaihaolistExample example);

    int deleteByExample(PaihaolistExample example);

    int insert(Paihaolist record);

    int insertSelective(Paihaolist record);

    List<Paihaolist> selectByExample(PaihaolistExample example);

    int updateByExampleSelective(@Param("record") Paihaolist record, @Param("example") PaihaolistExample example);

    int updateByExample(@Param("record") Paihaolist record, @Param("example") PaihaolistExample example);
    public int huoqvxzdehao(int sellerid);
    public void kaishipaihao(@Param("buyerid") int buyerid, @Param("sellerid") int sellerid, @Param("paihao") int paihao, @Param("ordernumber") int ordernumber);
    public int weiwancdingdanshu(int sellerid);
    public void add0(Paihaolist paihaolist);
    public int xzgongyouduoshaorenpaidui(int sellerid);
    public void over4(@Param("ordernumber")int ordernumber,@Param("sellerid")int sellerid);
    public int qianmianhaiyouduoshaoren(int sellerid);
    public List<Paihaolist> laiguodekehu(int sellerid);
    public int huoqvxiadancishu(int buyerid);
    public int huoqvshoudancishu(int sellerid);
    public List<Shtj1> shangjiatuijian1(int buyerid);
    public int shangjiatuijian2(@Param("buyerid") int buyerid, @Param("sellerid") int sellerid);
    public int shangjiatuijian3(@Param("buyerid") int buyerid, @Param("sellerid") int sellerid);
    public int shangjiatuijian4(@Param("buyerid") int buyerid, @Param("sellerid") int sellerid);
}