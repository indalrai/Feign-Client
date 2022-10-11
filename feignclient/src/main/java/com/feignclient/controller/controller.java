package com.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.util.feignServiceUtil;

@RestController
@RequestMapping("/demo")
public class controller {
	
	@Autowired
	private feignServiceUtil feignServiceUtil;
	
	@GetMapping("/name")
	public String getUserName() {
		return feignServiceUtil.getName();
	}
	
	@GetMapping("/address")
	public String getUserAddress() {
		return feignServiceUtil.getAddress();
	}
	
	@GetMapping("/status")
	public String getUserStatus() {
		return feignServiceUtil.getStatus();
	}
	
	
	
	
	

}
