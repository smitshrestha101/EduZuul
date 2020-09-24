package com.awale.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulProxy
@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@EnableZuulProxy
public class EduZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduZuulApplication.class, args);
	}

//	@Bean
//	public CorsFilter corsFilter() {
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		final CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		config.setAllowedOrigins(Collections.singletonList("*"));
//		config.setAllowedHeaders(Collections.singletonList("*"));
//		config.setAllowedMethods(Arrays.stream(HttpMethod.values()).map(HttpMethod::name).collect(Collectors.toList()));
//		source.registerCorsConfiguration("/**", config);
//		return new CorsFilter(source);
//	}



}
