package com.jh.springboot03logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot03LoggingApplicationTests {
	Logger logger = LoggerFactory.getLogger (getClass ());

	@Test
	public void contextLoads() {
		//日志的级别（由低到高）
		//可以调节日志级别，日志只会在高级别生效
		logger.trace ("这是trace日志（跟踪）");
		logger.debug ("这是debug信息");
		//默认是info级别以上的日志信息
		logger.info ("这是info日志");
		logger.warn ("这是warn日志");
		logger.error ("这是error错误");
	}

}
