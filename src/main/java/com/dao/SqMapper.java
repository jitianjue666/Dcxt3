package com.dao;

import com.vo.Sq;
import com.vo.SqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface SqMapper {
    long countByExample(SqExample example);

    int deleteByExample(SqExample example);

    int insert(Sq record);

    int insertSelective(Sq record);

    List<Sq> selectByExampleWithBLOBs(SqExample example);

    List<Sq> selectByExample(SqExample example);

    int updateByExampleSelective(@Param("record") Sq record, @Param("example") SqExample example);

    int updateByExampleWithBLOBs(@Param("record") Sq record, @Param("example") SqExample example);

    int updateByExample(@Param("record") Sq record, @Param("example") SqExample example);
    public List<Sq> getallwei();
}