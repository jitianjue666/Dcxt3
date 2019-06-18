package com.dao;

import com.vo.Couponlist;
import com.vo.CouponlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponlistMapper {
    long countByExample(CouponlistExample example);

    int deleteByExample(CouponlistExample example);

    int insert(Couponlist record);

    int insertSelective(Couponlist record);

    List<Couponlist> selectByExample(CouponlistExample example);

    int updateByExampleSelective(@Param("record") Couponlist record, @Param("example") CouponlistExample example);

    int updateByExample(@Param("record") Couponlist record, @Param("example") CouponlistExample example);
    public void fafang1(Couponlist couponlist);
    public List<Couponlist> getzijihongbao(int uuie);
    public List<Couponlist> getzijibendiangongbao(@Param("uuie")int uuie,@Param("sna")String sna);
    public void shanchu1(@Param("uuie")int uuie,@Param("cid")int cid);
    public List<Couponlist> getzijibendiankeyonghongbao(@Param("uuie")int uuie,@Param("sna")String sna,@Param("fromm")double fromm);
}