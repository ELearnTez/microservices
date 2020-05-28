package com.spring.boot.msk.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.spring.boot.msk.common.config.CommonConfiguration;

@SpringBootApplication
@Import(value = CommonConfiguration.class)
public class MobileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileServiceApplication.class, args);
	}

}
