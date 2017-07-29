package org.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 通过ribbon调用some service rest服务
 * @author admin
 *
 */
@Service
public class SomeHystrixService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "fallbackSome")
	public String getSome(){
		return restTemplate.getForObject("http://some/getsome", String.class);
	}
	
	public String fallbackSome(){
		return "some service故障";
	}
}
