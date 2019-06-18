package com.dao;

import com.vo.Dishcategory;
import com.vo.DishcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishcategoryMapper {
    long countByExample(DishcategoryExample example);

    int deleteByExample(DishcategoryExample example);

    int insert(Dishcategory record);

    int insertSelective(Dishcategory record);

    List<Dishcategory> selectByExample(DishcategoryExample example);

    int updateByExampleSelective(@Param("record") Dishcategory record, @Param("example") DishcategoryExample example);

    int updateByExample(@Param("record") Dishcategory record, @Param("example") DishcategoryExample example);
    public void xinzengcaipinfenlei(Dishcategory dishcategory);
    public List<Dishcategory> getallcategory(int shopshopno);
    public void shanchucaipinfenlei(@Param("shopshopno")int shopshopno,@Param("dcategory")String dcategory);
   
    
}