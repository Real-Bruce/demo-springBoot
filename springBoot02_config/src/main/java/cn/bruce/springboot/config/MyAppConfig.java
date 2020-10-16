package cn.bruce.springboot.config;

import cn.bruce.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bruce
 * @create 2020-10-09 11:20
 */

/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *
 * @Bean相当于在配置文件中用<bean><bean/>标签，用于注入组件
 *
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器添加组件。。。。");
        return new HelloService();
    }
}
