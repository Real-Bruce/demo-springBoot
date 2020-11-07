package cn.bruce.springboot06_theory.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Bruce
 * @create 2020-11-07 9:33
 * <ConfigurableApplicationContext>:监听IoC容器
 */
public class TestApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializer对象的initialize方法运行了......容器类型为：" + applicationContext);
    }
}
