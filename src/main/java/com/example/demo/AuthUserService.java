package com.example.demo;

import org.springframework.stereotype.Component;

/**
 *
 * @author Caozl
 * @date 2017-10-30
 */
@Component("authUserService")
public class AuthUserService extends AuthUserMapperBase{

    public void select(){
        this.selectByPrimaryKey(35);
    }
}
