package com.olx;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class OlxMasterdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxMasterdataApplication.class, args);
	}
	
	@Bean
	public Docket getCustomDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		//.paths(PathSelectors.ant("/mymarketplace/"))
		.paths(PathSelectors.any())
		.apis(RequestHandlerSelectors.basePackage("com.olx"))
		.build()
		.apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo(
				"OLX Masterdata Rest API Documentation",
				"This api is designed for OLX",
				"1.0.0",
				"http://www.zensar.com",
				new Contact("Sanjay Ingole", "http://www.gpl.com", "sanjay.ingole@zensar.com"),
				"GPL",
				"http://gpllicense.com",
				new ArrayList<VendorExtension>()
				);
	}

}
