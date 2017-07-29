package org.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * some服务
 *SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。

1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现； 
 2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；

如果你的classpath中添加了eureka，则它们的作用是一样的。

 */
@SpringBootApplication
@EnableDiscoveryClient//这里跟person中的@EnableEurekaClient作用一样
@RestController
public class SomeApplication 
{
	
	@Value("${my.message}") //1
	 private String message; 
	
	 @RequestMapping(value = "/getsome")
	 public String getsome(){
		 return message;
	 }
	 
    public static void main( String[] args )
    {
    	SpringApplication.run(SomeApplication.class, args);
    }
}
