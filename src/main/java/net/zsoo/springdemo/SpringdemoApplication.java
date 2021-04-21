package net.zsoo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import net.zsoo.springdemo.controller.DemoConfig;

@SpringBootApplication
@EnableConfigurationProperties(DemoConfig.class)
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

}
