package edu.global.ex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.global.ex.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/tables2")
	public String tables2(Model model) {

		
		model.addAttribute("boards", boardService.getList());
		
		return "tables2";
	}
	
}
