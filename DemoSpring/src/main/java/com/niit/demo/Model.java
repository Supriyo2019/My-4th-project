package com.niit.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Model {
@RequestMapping("/hello")
	public String display()
	{
		return "hello";
	}	
}
