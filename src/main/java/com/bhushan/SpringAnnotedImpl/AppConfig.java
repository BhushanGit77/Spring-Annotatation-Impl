package com.bhushan.SpringAnnotedImpl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.bhushan.SpringAnnotedImpl")
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public Processor getProcessor() {
//		return new SnapDragon();
//	}

}
