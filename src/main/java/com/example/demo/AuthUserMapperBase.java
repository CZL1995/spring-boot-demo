package com.example.demo;

import com.generator.dao.AuthUserMapper;
import com.generator.model.AuthUser;
import com.generator.model.AuthUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author caozl
 */

public class AuthUserMapperBase implements AuthUserMapper {

    @Autowired
    AuthUserMapper authUserMapper;
    @Override
    public long countByExample(AuthUserExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AuthUserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(AuthUser record) {
        return 0;
    }

    @Override
    public int insertSelective(AuthUser record) {
        return 0;
    }

    @Override
    public List<AuthUser> selectByExample(AuthUserExample example) {
        return null;
    }

    @Override
    public AuthUser selectByPrimaryKey(Integer userId) {
        return authUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByExampleSelective(AuthUser record, AuthUserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(AuthUser record, AuthUserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(AuthUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AuthUser record) {
        return 0;
    }
}