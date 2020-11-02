package cn.bruce.springboot.config;

import cn.bruce.springboot.filter.MyFilter;
import cn.bruce.springboot.listener.MyListener;
import cn.bruce.springboot.servlet.MyServlet;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Bruce
 * @create 2020-10-30 14:20
 */
@Configuration
public class MyServerConfig {
    /**
     * 配置嵌入式Servlet容器
     * 也可以将创建tomcat定制器示例，进行更多的配置
     * @return
     */
    /*@Bean
    public ConfigurableServletWebServerFactory webServerFactory() {

        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(9090);
        return factory;
    }*/

    /**
     * 注册三大组件
     * 注册Servlet组件
     */
    @Bean
    public ServletRegistrationBean myServlet() {

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(), "/myServlet");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

    /**
     * 注册Filter组件
     * @return filterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/test", "/myServlet"));
        return filterRegistrationBean;
    }

    /**
     * 注册Listener组件
     */
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return servletListenerRegistrationBean;
    }



}
