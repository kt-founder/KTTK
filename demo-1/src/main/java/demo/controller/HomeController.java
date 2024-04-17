package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.entity.Admin;
import demo.service.AdminService;
import demo.service.ModelService;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	private ModelService modelService;
	private AdminService adminService;
	
	public HomeController(ModelService modelService) {
		super();
		this.modelService = modelService;
		//this.adminService = adminService;
	}

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
	@GetMapping("/detection")
	public String goDetection() {
		return "Detection";
	}
	@GetMapping("/modelselector")
	public String goSelector(Model model) {
		model.addAttribute("ModelSelector",modelService.getAllModels());
		return "ModelSelector";
	}
	@GetMapping("recognition")
	public String goRecognition() {
		return "Recognition";
	}
	@GetMapping("modelselector/run/{id}")
	public String goRecognitionReal(@PathVariable Long id, Model model) {
		model.addAttribute("Modelselector", modelService.getModelByID(id));
		return "Recognition";
	}
	@GetMapping("/login?{username}&{password}")
	public String checkLogin(ModelMap model, @RequestParam("username")String username, 
			@RequestParam("password") String password, HttpSession session) {
		
		//boolean a = adminService.CheckLogin(username, password);
		
		return "models";
	}
}
