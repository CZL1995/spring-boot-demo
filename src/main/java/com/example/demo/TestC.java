package com.example.demo;

import com.generator.dao.AuthUserMapper;
import com.generator.model.AuthUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caozl
 * @date 2017-10-30
 */
@RequestMapping("user")
@RestController
public class TestC {

    /*@Autowired
    private AuthUserMapper userMapper;*/

    @Autowired
    public AuthUserService authUserService;



    @GetMapping("/list/all")
    public Object listAll() {
         //userMapper.selectByExample(new AuthUserExample());
        authUserService.select();
        return "adf";
    }
}
