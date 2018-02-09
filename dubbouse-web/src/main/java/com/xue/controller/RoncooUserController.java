package com.xue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xue.service.RoncooUserService;

@RestController
@RequestMapping("/user")
public class RoncooUserController {
	
	@Autowired
	private RoncooUserService roncooUserService;
	
	@RequestMapping(value="get/{id}")
	public String getUserById(@PathVariable Integer id) {
		if(null==id) {
			return null;
		}
		return roncooUserService.selectById(id).toString();
	}
}
