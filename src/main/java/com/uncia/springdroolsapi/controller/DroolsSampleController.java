package com.uncia.springdroolsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.springdroolsapi.model.Participant;
import com.uncia.springdroolsapi.model.Rate;
import com.uncia.springdroolsapi.service.DroolsService;

@RestController()
@RequestMapping("/ruleservice")
public class DroolsSampleController {

	@Autowired
	 private DroolsService bankService;
	 
	 @PostMapping("/getrate")
	 public ResponseEntity<Rate> getRate(@RequestBody Participant request){
	  Rate rate = bankService.getRate(request);
	  return new ResponseEntity<>(rate, HttpStatus.OK);
	 }
}
