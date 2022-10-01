package net.GLwebapp.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.GLwebapp.springboot.MembersService;

@Controller
public class MembersController {
	
	@Autowired
	private MembersService memberService;

	@GetMapping("/")
	public String viewHomePage (Model model) {
		model.addAttribute("listMembers",memberService.getAllMembers());
		return "index";
	}
}
