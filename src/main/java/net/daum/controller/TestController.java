package net.daum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.daum.mapper.TestMapper;
import net.daum.vo.TestBoard;

@Controller
@RequestMapping("/home")
public class TestController {

	@Autowired
	TestMapper testMapper;
	
	@GetMapping("/")
	public String testmain() {
		
		return "test/home";
	}
	
	@GetMapping("/aop_cont")
	public String boardContent(@RequestParam(value= "bno") Integer bno, Model model) {
		
		TestBoard testboard =  testMapper.getTestBoard(bno);

		testMapper.addHit(bno, testboard.getBhit()+1);
		
		model.addAttribute("testboard", testboard);
		
		return "test/viewBoard";
		
	}
	
}
