package cn.bruce.springboot06_theory.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Bruce
 * @create 2020-11-07 10:36
 */
public class TestSpringApplicationRunListener implements SpringApplicationRunListener {

    // 此构造器必须书写，否则会报错
    public TestSpringApplicationRunListener(SpringApplication springApplication, String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("SpringApplicationRunListener类中的starting方法被调用......");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        Object osName = environment.getSystemProperties().get("os.name");
        System.out.println("SpringApplicationRunListener类中的environmentPrepared方法被调用......" + osName);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener类中的contextPrepared方法被调用......");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener类中的contextLoaded方法被调用......");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener类中的started方法被调用......");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener类中的running方法被调用......");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("SpringApplicationRunListener类中的failed方法被调用......");
    }
}
