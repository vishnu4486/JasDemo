package com.yash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String get() {
		return "welcome yash";
	}

	@GetMapping("/emp")
	public Employee showuser() {
		Employee emp = new Employee(1, "jas");
		return emp;
	}
	@GetMapping("/user")
	public Employee showemp() {
		
		Employee emp =new Employee(10, "vsb");
		return emp;
	}
}
