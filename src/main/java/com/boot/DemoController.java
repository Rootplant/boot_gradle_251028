package com.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@ResponseBody
public class DemoController {
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		log.info("Boot Gradle");

		return "gradle";
	}

	@RequestMapping("/hello.do")	
//	public String hello() {
	public String hello(Model model) {
<<<<<<< HEAD
		log.info("안녕하세요! 111 222 333");
=======
		log.info("안녕하세요! 111 222 444");
>>>>>>> 85078530e82e8be0ddf64d473f74302b18a0171e
		model.addAttribute("message", "hello.jsp 입니다");

		return "hello";
	}
}
