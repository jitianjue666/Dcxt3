package com.dao;

import com.vo.Zhifu;
import com.vo.ZhifuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhifuMapper {
    long countByExample(ZhifuExample example);

    int deleteByExample(ZhifuExample example);

    int deleteByPrimaryKey(Integer zhifuid);

    int insert(Zhifu record);

    int insertSelective(Zhifu record);

    List<Zhifu> selectByExample(ZhifuExample example);

    Zhifu selectByPrimaryKey(Integer zhifuid);

    int updateByExampleSelective(@Param("record") Zhifu record, @Param("example") ZhifuExample example);

    int updateByExample(@Param("record") Zhifu record, @Param("example") ZhifuExample example);

    int updateByPrimaryKeySelective(Zhifu record);

    int updateByPrimaryKey(Zhifu record);
}