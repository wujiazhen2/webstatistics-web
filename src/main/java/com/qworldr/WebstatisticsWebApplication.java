package com.qworldr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.qworldr"})
@MapperScan(basePackages = {"com.qworldr.webstatistics.generator.dao","com.qworldr.webstatistics.dao"})
public class WebstatisticsWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebstatisticsWebApplication.class, args);
	}
}
