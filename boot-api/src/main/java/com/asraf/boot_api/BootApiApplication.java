package com.asraf.boot_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asraf.boot_service.MyBootService;

@SpringBootApplication(scanBasePackageClasses = { MyBootService.class })
public class BootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApiApplication.class, args);
	}
}
