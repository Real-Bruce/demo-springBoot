package cn.bruce.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    // 日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        // 日志的记录级别：
        // 由低到高 trace<debug<info<warn<error
        // 调整日志的输出级别，日志只会在这个级别和以后的高级别生效
        logger.trace("trace级别的日志。。。");
        logger.debug("debug级别的日志。。。");
        // SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        logger.info("info级别的日志。。。");
        logger.warn("warn级别的日志。。。");
        logger.error("error级别的日志。。。");
    }

}
