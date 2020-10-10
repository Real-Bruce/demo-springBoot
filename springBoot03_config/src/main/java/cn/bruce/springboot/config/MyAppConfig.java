package cn.bruce.springboot.config;

import cn.bruce.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bruce
 * @create 2020-10-09 11:20
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService02() {
        System.out.println("配置类@Bean给容器添加组件。。。。");
        return new HelloService();
    }
}
