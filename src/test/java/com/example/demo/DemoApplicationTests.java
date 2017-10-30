package com.example.demo;

import com.generator.dao.AuthUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.ManagedBean;

@RunWith(SpringRunner.class)
@MapperScan("com.generator.mapper")
@SpringBootTest
public class DemoApplicationTests {


	@Test
	public void contextLoads() {
	}

}
