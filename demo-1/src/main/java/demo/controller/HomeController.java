package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.entity.Admin;
import demo.service.AdminService;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	AdminService adminService;
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home")
	public String turnHome() {
		return "home";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/login?{username}&{password}")
	public String checkLogin(ModelMap model, @RequestParam("username")String username, 
			@RequestParam("password") String password, HttpSession session) {
		
		//boolean a = adminService.CheckLogin(username, password);
		
		return "models";
	}
}
