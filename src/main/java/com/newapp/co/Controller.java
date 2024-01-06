package com.newapp.co;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/newapp")
	public String name() {
		return "Its a newapp";
	}

}
