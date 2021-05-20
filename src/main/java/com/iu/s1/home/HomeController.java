package com.iu.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  =======================================
               JSP Project
  =======================================
  */

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) throws Exception {
		model.addAttribute("message", "JSP Project");
		model.addAttribute("user", "iu");
		model.addAttribute("msg", "test");
		return "index";
	}
	
	@GetMapping("/member/join")
	public String test() throws Exception {
		return "member/join";
	}

}