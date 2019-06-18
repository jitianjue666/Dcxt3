package com.dao;

import com.vo.Shangpu;
import com.vo.ShangpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShangpuMapper {
    long countByExample(ShangpuExample example);

    int deleteByExample(ShangpuExample example);

    int insert(Shangpu record);

    int insertSelective(Shangpu record);

    List<Shangpu> selectByExample(ShangpuExample example);

    int updateByExampleSelective(@Param("record") Shangpu record, @Param("example") ShangpuExample example);

    int updateByExample(@Param("record") Shangpu record, @Param("example") ShangpuExample example);
}