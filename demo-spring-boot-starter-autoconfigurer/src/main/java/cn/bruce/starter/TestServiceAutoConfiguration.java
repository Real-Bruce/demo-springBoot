package cn.bruce.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bruce
 * @create 2020-11-10 15:33
 */
@Configuration
@ConditionalOnWebApplication // web应用生效
@EnableConfigurationProperties(TestProperties.class )
public class TestServiceAutoConfiguration {

    @Autowired
    TestProperties testProperties;

    @Bean
    public TestService testService() {
        TestService testService = new TestService();
        testService.setTestProperties(testProperties);
        return testService;
    }
}
