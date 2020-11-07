package cn.bruce.springboot06_theory.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Bruce
 * @create 2020-11-07 11:18
 */
@Component
public class TestApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner对象的run方法执行了......");
    }
}
