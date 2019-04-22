package com.example.ThymeLeaf;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map value,@PathVariable String name) {
		value.put("name", name);
		System.out.println("===========>"+name);
		return "hello";
	}
	
}
