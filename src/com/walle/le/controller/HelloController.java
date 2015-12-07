package com.walle.le.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walle.le.json.JsonResponse;
import com.walle.le.vo.User;

@RestController
@RequestMapping("/print")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello() {
		return "fdasfasdfasdf";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public JsonResponse<String> printTest(User user) {
		System.out.println("id="+user.getid_w());
		System.out.println("name="+user.getname_w());
		System.out.println(user.toString());
		return new JsonResponse<>(user.toString());
	}
}
