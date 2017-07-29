package org.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ui.bean.Person;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * person service的断路器，即调用person方法失败时调用断路器的方法fallbackSave
 * @author admin
 *
 */
@Service
public class PersonHystrixService {

	
	@Autowired
	PersonService personService;
	
	@HystrixCommand(fallbackMethod = "fallbackSave")
	public List<Person> save(String name){
		return personService.save(name);
	}
	
	public List<Person> fallbackSave(){
		List<Person> list = new ArrayList<Person>();
		Person p = new Person("Person Service 故障");
		list.add(p);
		return list;
	}
}
