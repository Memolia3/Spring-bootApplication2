package com.example.demo.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Main {
	
	@GetMapping("/introduce/index")
	public String defaultView(Model model) {
		model.addAttribute("ui", new UserInfo());
		return "/html/index.html";
	}
	
	@PostMapping("/introduce/request")
	public String userdata(@ModelAttribute UserInfo ui,Model model) {
		model.addAttribute("userInfo", ui);
		model.addAttribute("name", ui.getName());
		model.addAttribute("address", ui.getAddress());
		return "/html/thx.html";
	}
	
}
