package cn.bruce.springboot;

import cn.bruce.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testHelloService(){
		boolean hello = applicationContext.containsBean("helloService");
		System.out.println(hello);
		System.out.println("=============");
		boolean test = applicationContext.containsBean("test");
		System.out.println(test);
	}

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
