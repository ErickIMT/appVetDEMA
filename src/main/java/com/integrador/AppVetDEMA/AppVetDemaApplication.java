package com.integrador.AppVetDEMA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.integrador.AppVetDEMA")
public class AppVetDemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppVetDemaApplication.class, args);
	}

}
