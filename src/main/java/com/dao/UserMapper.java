package com.dao;

import com.vo.User;
//import com.vo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
   // long countByExample(UserExample example);

    //int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userno);

    int insert(User record);

    int insertSelective(User record);

   // List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userno);

    //int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

  //  int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    public User selectByLogin(String userid);
    public User selectByLogin2(String userid);
    public User selectByLogin3(String userid);
    public int register1(User user);
    public int register2(User user);
    public int getuserno(String userid);
    public User getglymessage(String userid);
    public List<User> getallguke();
    public String getuserid(int userno);
    public List<User> getallxiaofeizhe();
    public List<User> getallshangpuzhuren();
    public User nogetuser(int userno);
    public int xiugaigerenxinxi(@Param("userno")int userno,@Param("userpassword")String userpassword,@Param("useremail")String useremail,@Param("usercellphone")String usercellphone);
    public int shanchuyonghu(int userno);
}