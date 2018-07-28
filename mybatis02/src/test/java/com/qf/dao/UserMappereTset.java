package com.qf.dao;

import com.qf.pojo.User;
import org.junit.Test;

public class UserMappereTset {
    @Test
    public void testdelById(){
        UserMapperDao userMapperDao=new UserMapperDao();
        int i = userMapperDao.deleteByPrimaryKey(8L);
        System.out.println(i);
    }
    @Test
    public void testadd(){
        UserMapperDao userMapperDao=new UserMapperDao();
        User user=new User();
        user.setUsername("姚杰男");
        user.setPassword("13454512");
        userMapperDao.insert(user);
    }

    @Test
    public void testadd2(){
        UserMapperDao userMapperDao=new UserMapperDao();
        User user=new User();
            user.setUsername("齐海涛");
        user.setPassword("1qqqqqqqqqqqqqq");
        int insert = userMapperDao.insert(user);
        System.out.println(insert);
    }

    @Test
    public void selectById(){
        UserMapperDao userMapperDao =new UserMapperDao();
        User user = userMapperDao.selectByPrimaryKey(15L);
        System.out.println(user.toString());
    }


    @Test
    public void update1(){
        User user=new User();
        user.setUsername("修改2");
       // user.setPassword("111111111111111");
        user.setId(17L);
        UserMapperDao userMapperDao=new UserMapperDao();
        int i = userMapperDao.updateByPrimaryKeySelective(user);
        System.out.println(i);
    }

    @Test
    public void update2(){
        User user=new User();
        user.setUsername("修改2");
        user.setPassword("2222222222222");
        user.setId(19L);
        UserMapperDao userMapperDao=new UserMapperDao();
        int i = userMapperDao.updateByPrimaryKey(user);
        System.out.println(i);
    }
}
