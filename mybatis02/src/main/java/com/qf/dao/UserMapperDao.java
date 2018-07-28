package com.qf.dao;

import com.qf.pojo.User;
import com.qf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserMapperDao implements UserMapper {
    @Override
    public int deleteByPrimaryKey(Long id) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        UserMapper mapper = sqlSesssion.getMapper(UserMapper.class);
        int i = mapper.deleteByPrimaryKey(id);
        sqlSesssion.commit();
        sqlSesssion.close();

        return i;
    }

    @Override
    public int insert(User record) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
;
        UserMapper mapper = sqlSesssion.getMapper(UserMapper.class);
        int i = mapper.insertSelective(record);
        sqlSesssion.commit();
        sqlSesssion.close();


        return i;
    }

    @Override
    public int insertSelective(User record) {
        SqlSession sqlSession =MybatisUtil.getSqlSesssion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();

        return i;
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        SqlSession sqlSesssion = MybatisUtil.getSqlSesssion();
        UserMapper mapper = sqlSesssion.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(id);
        sqlSesssion.commit();
        sqlSesssion.close();
        return user;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        SqlSession sqlSession=MybatisUtil.getSqlSesssion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }

    @Override
    public int updateByPrimaryKey(User record) {

        SqlSession sqlSession=MybatisUtil.getSqlSesssion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateByPrimaryKey(record);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}
