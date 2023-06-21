package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.User;

@Controller
public class UserController {
	
	
	@GetMapping("/")
	public String getFormData(Model model) {
		
		User userobj = new User();
		model.addAttribute("user", userobj);
		return "index";
	}
	
	@PostMapping("/register")
	public String getRegisterData(@Valid  User user , BindingResult result,  Model model) {
		
		System.out.println(user);
		if(result.hasErrors()) {
			return "index";
			}
		
		
		model.addAttribute("user", "Register..........");
		
		return "register";
	}

}
