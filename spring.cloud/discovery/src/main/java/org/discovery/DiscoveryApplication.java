package org.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DiscoveryApplication.class, args);
    }
}
