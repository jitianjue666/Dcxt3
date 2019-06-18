package com.dao;

import com.vo.Shopapply;
import com.vo.ShopapplyExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ShopapplyMapper {
    long countByExample(ShopapplyExample example);

    int deleteByExample(ShopapplyExample example);

    int deleteByPrimaryKey(Integer applyno);

    int insert(Shopapply record);

    int insertSelective(Shopapply record);

    List<Shopapply> selectByExample(ShopapplyExample example);

    Shopapply selectByPrimaryKey(Integer applyno);

    int updateByExampleSelective(@Param("record") Shopapply record, @Param("example") ShopapplyExample example);

    int updateByExample(@Param("record") Shopapply record, @Param("example") ShopapplyExample example);

    int updateByPrimaryKeySelective(Shopapply record);

    int updateByPrimaryKey(Shopapply record);
    public void shopshenqing3(Shopapply shopapply);
    public void updateadminno(@Param("shopnumber")int shopnumber,@Param("adminno")int adminno);
    public void updatedealtime(@Param("shopnumber")int shopnumber,@Param("dealtime")Date dealtime);
    public void updateapstate(int shopnumber);
    public void updateapstate2(int shopnumber);
}