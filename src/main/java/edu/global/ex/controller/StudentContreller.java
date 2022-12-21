package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.vo.StudentInformation;

@Controller
@RequestMapping("/student")
public class StudentContreller {
	
	// http://localhost:8282/student/input
	@GetMapping("/input")
	public String input() {
		
		return "FormInput";
	}
	
	// http://localhost:8282/student/result
	@PostMapping("/result")
	public String result(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		
		model.addAttribute("id", id);
		
		return "FormResult";
	}
	
	// http://localhost:8282/student/view?name=abc&age=12
	@GetMapping("/view")
	public String view(@ModelAttribute("student") StudentInformation studentInformation) {
		return "FormResult";
	}
	
	// http://localhost:8282/student/view2?name=abc&age=12
	@GetMapping("/view2")
	public String view2(StudentInformation student) {
		return "FormResult"; // 위와 같이 지정해 주어도 view에서 불러올 때는 StudentInformation이다.
	}
	
	// http://localhost:8282/student/redirect?name=abc&age=20
	@GetMapping("/redirect")
	public String redirect(StudentInformation studentInformation) {
		
		int age = studentInformation.getAge();
		
		if(age >= 20) {
			return "redirect:/student/input";
		}
		
		return "FormResult";
	}
}
