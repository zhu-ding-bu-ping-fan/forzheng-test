package com.forzheng.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ForzhengTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForzhengTestApplication.class, args);
	}
	
	@Value("${mybatis.config-location}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
