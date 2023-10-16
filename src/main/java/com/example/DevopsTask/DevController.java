package com.example.DevopsTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {
	@Autowired
	@GetMapping(value="/Get")
	public String get() {
		return "Don't use my IP Addrees";
	}

}
