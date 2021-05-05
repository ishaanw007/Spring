package com.ncu.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.model.firstmodel;
import com.ncu.model.secondmodel;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "vaishali");
		return "index";
	}
//	@RequestMapping("/login")
//	public String loginmsg(Model model) {
//		model.addAttribute("msg", "kalra login");
//		return "login";
//	}
//	<FIRST METHOD>
//	@RequestMapping("/login")
//	public String doLogin(HttpServletRequest request, Model model) {
//		String name=request.getParameter("name");
//		model.addAttribute("msg", "ishaan login"+name);
//		return "login";
//	}
//	
//	<SECOND METHOD>
//	@RequestMapping("/login")
//	public String doLogin() {
//		
//		return "login";
//	}
//	@RequestMapping("/loginsucess")
//	public String logindone(@RequestParam(required=false,name="name")String userid, Model model) {
//	model.addAttribute("msg", userid);
//	return "loginsucess";
//	}
	
	
//	<THIRD METHOD>
	@RequestMapping(path="/loginm")
	public String doLogin(Model model) {
		model.addAttribute("userModel", new firstmodel());
		return "loginm";
		
	}
	
	@RequestMapping(path="/loginms")
	public String logindone(@ModelAttribute("userModel") firstmodel user , Model model) {
	model.addAttribute("msg", user.getName());
	return "loginms";
	}
	
	
	
	
	
	@RequestMapping(path="/details")
	public String details(Model model) {
		model.addAttribute("coustomerModel", new secondmodel());
		return "details";
		
	}
	
	@RequestMapping(path="/sumbit")
	public String sumbit(@Valid@ModelAttribute("coustomerModel") secondmodel det , BindingResult theBindingResult, Model model) {
	if(theBindingResult.hasErrors()) {
		return"details";
		
	}
	else {
	model.addAttribute("msg1", det.getFname()+det.getLname());
	model.addAttribute("msg2", det.getGender());
	return "sumbit";
	}
	
	}
	
	
	@RequestMapping("/init")
	public String initView(Model model) {
	System.out.println("Handler method is called.");



	model.addAttribute("welcome_msg", "Spring Mvc Internationalization Example");
	return "intlocal";
	}



}