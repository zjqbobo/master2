package org.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * person服务
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class PersonApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(PersonApplication.class, args);
    }
}
