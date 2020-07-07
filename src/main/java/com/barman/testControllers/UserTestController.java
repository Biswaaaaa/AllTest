package com.barman.testControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestController {

	
	@RequestMapping("/test1")
	public ResponseEntity<?> test1(){
		return new ResponseEntity<String>("Test1 Executed", HttpStatus.OK);
	}
	
}
