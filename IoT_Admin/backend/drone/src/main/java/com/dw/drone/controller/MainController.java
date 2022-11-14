package com.dw.drone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * 프론트를 이클립스에서 관리하면 Controller ex) JSP
 * 프론트가 분리되어 있으면 RestController ex) React, Angular
 */

@Controller
public class MainController {
	@GetMapping("/home")
	public String loadHomePage() {
		/*
		 * return 타입은 String
		 * html 페이지 이름을 리턴
		 */
		return "home";
	}
}
