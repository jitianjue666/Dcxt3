package com.dao;

import com.vo.Jilulu;
import com.vo.JiluluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiluluMapper {
    long countByExample(JiluluExample example);

    int deleteByExample(JiluluExample example);

    int insert(Jilulu record);

    int insertSelective(Jilulu record);

    List<Jilulu> selectByExample(JiluluExample example);

    int updateByExampleSelective(@Param("record") Jilulu record, @Param("example") JiluluExample example);

    int updateByExample(@Param("record") Jilulu record, @Param("example") JiluluExample example);
}