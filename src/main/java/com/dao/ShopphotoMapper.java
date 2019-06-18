package com.dao;

import com.vo.Shopphoto;
import com.vo.ShopphotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public interface ShopphotoMapper {
    long countByExample(ShopphotoExample example);

    int deleteByExample(ShopphotoExample example);

    int insert(Shopphoto record);

    int insertSelective(Shopphoto record);

    List<Shopphoto> selectByExampleWithBLOBs(ShopphotoExample example);

    List<Shopphoto> selectByExample(ShopphotoExample example);

    int updateByExampleSelective(@Param("record") Shopphoto record, @Param("example") ShopphotoExample example);

    int updateByExampleWithBLOBs(@Param("record") Shopphoto record, @Param("example") ShopphotoExample example);

    int updateByExample(@Param("record") Shopphoto record, @Param("example") ShopphotoExample example);
    //public void shangpushenqing2(int sno,byte[] sphoto);
    public void shangpushenqing4(Shopphoto shopphoto);
    public void shangpushenqing2(Shopphoto shopphoto);
    Shopphoto sp(String soname);
    Shopphoto sp2(int sno);
}