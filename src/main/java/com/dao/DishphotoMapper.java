package com.dao;

import com.vo.Dish;
import com.vo.Dishphoto;
import com.vo.DishphotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishphotoMapper {
    long countByExample(DishphotoExample example);

    int deleteByExample(DishphotoExample example);

    int insert(Dishphoto record);

    int insertSelective(Dishphoto record);

    List<Dishphoto> selectByExampleWithBLOBs(DishphotoExample example);

    List<Dishphoto> selectByExample(DishphotoExample example);

    int updateByExampleSelective(@Param("record") Dishphoto record, @Param("example") DishphotoExample example);

    int updateByExampleWithBLOBs(@Param("record") Dishphoto record, @Param("example") DishphotoExample example);

    int updateByExample(@Param("record") Dishphoto record, @Param("example") DishphotoExample example);
    public void caipintupian(Dishphoto dishphoto);
    public Dishphoto gettp(int did);
    public void xgcptp(@Param("did")int did,@Param("dphoto")byte[] dphoto);
}