package net.daum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.daum.vo.SampleVO;

//@RestController
//@RequestMapping("/")
//public class RestTestController {
//
//	@GetMapping(value = "/sendList", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<SampleVO> test() {
//		
//		List<SampleVO> list = new ArrayList<SampleVO>();
//		SampleVO sample1 = new SampleVO();
//		sample1.setMno(1);
//		sample1.setFirstName("����");
//		sample1.setLastName("��մ�");
//		
//		SampleVO sample2 = new SampleVO();
//		sample2.setMno(2);
//		sample2.setFirstName("����");
//		sample2.setLastName("��մ�");
//	
//		
//		list.add(sample1);
//		list.add(sample2);
//		return list;
//	}
//	
//}
