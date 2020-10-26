package cn.bruce.springboot.config;

import cn.bruce.springboot.component.LoginHandlerInterceptor;
import cn.bruce.springboot.component.MyLocaleRrsovler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
         * 添加视图映射，自定义配置和自动配置组件会一起加载
         */
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            /**
             * 注册拦截器
             * @param registry
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                // 拦截除去登陆页面的，所有的页面请求，只有登录后才能访问全部的页面
                // SpringBoot已经做好了静态资源映射
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html", "/", "/user/login");
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
