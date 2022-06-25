package com.example.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/")   // 주소창에 localhost:8080을 입력하면
	public String indexPage() {
		return "index";   //
	}

}