package cn.bruce.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot05JdbcApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws SQLException {
		System.out.println("数据源为："+dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println("获取到的数据库连接为："+connection);
		connection.close();
	}

}
