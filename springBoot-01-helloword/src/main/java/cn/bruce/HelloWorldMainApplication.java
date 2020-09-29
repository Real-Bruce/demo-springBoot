package cn.bruce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bruce
 * @create 2020-09-29 15:55
 */

/**
 * @SpringBootApplication 用于标注一个主程序类，声明为一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
