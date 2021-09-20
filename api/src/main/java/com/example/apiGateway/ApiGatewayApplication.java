package com.example.apiGateway;


import com.example.apiGateway.filter.ErrorFilter;
import com.example.apiGateway.filter.PostFilter;
import com.example.apiGateway.filter.PreFilter;
import com.example.apiGateway.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public PostFilter getPostFilter(){
		return new PostFilter();
	}

	@Bean
	public ErrorFilter getErrorFilter(){
		return new ErrorFilter();
	}

	@Bean
	public PreFilter getPreFilter(){
		return new PreFilter();
	}

	@Bean
	public RouteFilter getRouteFilter(){
		return new RouteFilter();
	}
}

