package com.dao;

import com.vo.Shouru;
import com.vo.ShouruExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShouruMapper {
    long countByExample(ShouruExample example);

    int deleteByExample(ShouruExample example);

    int insert(Shouru record);

    int insertSelective(Shouru record);

    List<Shouru> selectByExample(ShouruExample example);

    int updateByExampleSelective(@Param("record") Shouru record, @Param("example") ShouruExample example);

    int updateByExample(@Param("record") Shouru record, @Param("example") ShouruExample example);
    public void tianjiajilu(Shouru shouru);
    public Shouru getone(@Param("dingdanhao")int dingdanhao,@Param("dianjiaid")int dianjiaid);
}