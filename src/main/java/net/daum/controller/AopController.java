package net.daum.controller;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import net.daum.mapper.TestMapper;
import net.daum.vo.TestBoard;

@RestController
@RequestMapping("/")
public class AopController {

	
	@Autowired
	TestMapper testMapper;
	
	@GetMapping(value = "/testList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TestBoard>> boardList() {
		
		List<TestBoard> list =  testMapper.list();
		
		ResponseEntity<List<TestBoard>> entity =  ResponseEntity
				.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(list);
		
		
		return entity;
	}
	
//	@GetMapping(value = "/aop_cont", produces = MediaType.APPLICATION_JSON_VALUE)
//	public TestBoard board(@RequestParam(value= "bno") int bno) {
//	
//		
//		
//		return null;
//	}
}
