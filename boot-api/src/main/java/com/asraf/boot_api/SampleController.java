package com.asraf.boot_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asraf.boot_service.Model;
import com.asraf.boot_service.MyBootService;

@RestController
public class SampleController {
	
	private MyBootService myBootService;
	@Autowired
	public SampleController(MyBootService myBootService) {
		this.myBootService = myBootService;
	}
	
	@GetMapping("/sample")
	public Model showForm() {
		myBootService.show();
		return new Model();
	}
	
}