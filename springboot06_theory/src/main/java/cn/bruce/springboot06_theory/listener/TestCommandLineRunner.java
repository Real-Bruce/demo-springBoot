package cn.bruce.springboot06_theory.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Bruce
 * @create 2020-11-07 11:32
 */
@Component
public class TestCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner对象的run方法执行了......参数："+ Arrays.asList(args));
    }
}
