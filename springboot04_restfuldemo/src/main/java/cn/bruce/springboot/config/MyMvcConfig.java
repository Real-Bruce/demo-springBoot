package cn.bruce.springboot.config;

import cn.bruce.springboot.component.MyLocaleRrsovler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Bruce
 * @create 2020-10-23 15:08
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 所有的WebMVCConfiguration组件会一起加载
     * @return
     */
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        /**
         * 添加视图映射
         */
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
        };
        return webMvcConfigurer;
    }

    /**
     * 将我们自定义的LocateResolver组件加载到容器中
     * @return
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleRrsovler();
    }

}
