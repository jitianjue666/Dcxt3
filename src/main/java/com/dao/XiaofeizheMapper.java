package com.dao;

import com.vo.Xiaofeizhe;
import com.vo.XiaofeizheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaofeizheMapper {
    long countByExample(XiaofeizheExample example);

    int deleteByExample(XiaofeizheExample example);

    int insert(Xiaofeizhe record);

    int insertSelective(Xiaofeizhe record);

    List<Xiaofeizhe> selectByExample(XiaofeizheExample example);

    int updateByExampleSelective(@Param("record") Xiaofeizhe record, @Param("example") XiaofeizheExample example);

    int updateByExample(@Param("record") Xiaofeizhe record, @Param("example") XiaofeizheExample example);
}