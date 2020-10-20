package cn.bruce.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot03LoggingApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 日志的输出级别：由高到低 trace<debug<info<warn<error
	 * 可以调整日志的输出级别；设置日志输出级别后，日志只会在当前级别和以后的级别生效
	 */
	@Test
	void contextLoads() {
		logger.trace("trace级别日志。。。。。");
		logger.debug("debug级别日志。。。。。");
		// Spring Boot默认输出info级别的日志，没有指定日志级别则使用Spring Boot默认的级别（root级别）
		logger.info("info级别日志。。。。。");
		logger.warn("warn级别日志。。。。。");
		logger.error("error级别日志。。。。。");
	}

}
