package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.global.ex.vo.Member;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String hello() {
		return "Hello"; //jsp파일 이름
	}

	@GetMapping("/home") // /home?id=1234&pw=abcd
	public String home(HttpServletRequest request, Model model) {
		
		int id = Integer.valueOf(request.getParameter("id"));
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "Home"; //jsp파일 이름
	}
	
	@GetMapping("/home/house")
	public String house() {
		return "Home/House"; // 폴더/jsp파일 이름
	}
	
	// view에 값 전달 : model
	@GetMapping("/boards")
	public String boards(Model model) {
		
		model.addAttribute("id", 30);
		model.addAttribute("age", 10);
		
		return "Board/Board"; // 폴더/jsp파일 이름
	}
	
	// (JSON 넘길 때 필요)
//	@GetMapping("/board")
//	public ModelAndView board() {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("id", 30);
//		mv.addObject("age", 10);
//		mv.setViewName("Board/Board");
//
//		return mv;
//	}
	
	@RequestMapping(value = "/req", method = RequestMethod.GET) // = GetMapping
	public String req() {
		return "Hello";
	}
	
	// @RequestParam
	@GetMapping("/login") // /login?id=1234&pw=abcd
	public String login(Model model,
			@RequestParam("id") String id, 
			@RequestParam("pw") String pw) {
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "Home"; //jsp파일 이름
	}	
	
	// Member VO(커맨드 객체): model에 담지 않아도 direct로 view에 전달(내부적으로 model에 저장)
	@GetMapping("/login2") // /login2?id=1234&pw=abcd&age=12
	public String login2(Member member, Model model) {
		
		return "Home"; //jsp파일 이름
	}	
	
	// http://localhost:8282/login3?id=1234&pw=abcd&age=12
	// restful 방식: url 파라미터화
	// http://localhost:8282/login3/{id}/{pw}/{age}
	// http://localhost:8282/login3/1234/abcd/50
	@GetMapping("/login3/{id}/{pw}/{age}") // /login2?id=1234&pw=abcd&age=12
	public String login3(@PathVariable String id,
						@PathVariable String pw,
						@PathVariable String age, Model model) {
		
		model.addAttribute("age" , age);
		model.addAttribute("id" , id);
		model.addAttribute("pw" , pw);
		
		return "Home"; //jsp파일 이름
	}	
}


