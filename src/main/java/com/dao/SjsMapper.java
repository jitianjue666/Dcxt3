package com.dao;

import com.vo.Sjs;
import com.vo.SjsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SjsMapper {
    long countByExample(SjsExample example);

    int deleteByExample(SjsExample example);

    int insert(Sjs record);

    int insertSelective(Sjs record);

    List<Sjs> selectByExample(SjsExample example);

    int updateByExampleSelective(@Param("record") Sjs record, @Param("example") SjsExample example);

    int updateByExample(@Param("record") Sjs record, @Param("example") SjsExample example);
    int getsjs();
    void charusjs(int suijishu);
}