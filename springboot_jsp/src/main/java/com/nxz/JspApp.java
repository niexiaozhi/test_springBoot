package com.nxz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * mybatis启动方式可以不在Mapper层加mapper注解， 直接在启动类加@MapperScan(basePackages =
 * {"com.nxz.mapper" })
 * 
 * @author Administrator
 *
 */
@SpringBootApplication // 扫描当前同级包以及同级包的子包
@MapperScan(basePackages = { "com.nxz.mapper" }) // 扫描mapper包
public class JspApp {

	public static void main(String[] args) {
		SpringApplication.run(JspApp.class, args);
	}

}
