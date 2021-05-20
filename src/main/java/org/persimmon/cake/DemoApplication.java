package org.persimmon.cake;

import org.apache.ibatis.io.Resources;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		// 读取配置文件
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SpringApplication.run(DemoApplication.class, args);
	}

}
