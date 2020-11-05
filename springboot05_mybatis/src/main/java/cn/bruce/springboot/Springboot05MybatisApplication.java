package cn.bruce.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "cn.bruce.springboot.dao")
@SpringBootApplication
public class Springboot05MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot05MybatisApplication.class, args);
	}

}
