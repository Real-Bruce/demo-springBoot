package cn.bruce.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author Bruce
 * @create 2020-11-04 11:26
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                // 配置允许驼峰命名转化，即驼峰命名和下划线命名转化
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }


}
