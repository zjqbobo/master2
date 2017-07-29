package org.ui.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ui.bean.Person;

/**
 * 通过feign调用Person Service(rest 服务）
 * @author admin
 *
 */
@FeignClient("person")
public interface PersonService {

	@RequestMapping(method = RequestMethod.POST,value = "/save",
			produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody List<Person> save(@RequestBody String name);
}
