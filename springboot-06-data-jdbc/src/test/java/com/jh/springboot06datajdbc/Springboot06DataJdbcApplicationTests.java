package com.jh.springboot06datajdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06DataJdbcApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println (dataSource.getClass ());
		//class org.apache.tomcat.jdbc.pool.DataSource
		Connection connection = dataSource.getConnection ();
		System.out.println (connection);
		connection.close ();
	}

}
