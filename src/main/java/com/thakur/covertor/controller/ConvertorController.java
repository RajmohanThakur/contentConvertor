package com.thakur.covertor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/convertor/")
public class ConvertorController {

	@GetMapping("/convertToHtml")
	public ResponseEntity<String> converToHTML() {
		
		
		return new ResponseEntity<>("Converted to HTML", HttpStatus.OK);
		
	}
	
	@GetMapping("convertToJson")
	public ResponseEntity<String> converToJSON() {
		
		
		return new ResponseEntity<>("Converted to JSON", HttpStatus.OK);
		
	}
}
