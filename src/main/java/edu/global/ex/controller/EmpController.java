package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.global.ex.page.Criteria;
import edu.global.ex.page.PageVO;
import edu.global.ex.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@GetMapping("/list")
	public String list(Criteria cri, Model model) {
		
		model.addAttribute("boards", empService.getList(cri));
		
		int total = empService.getTotal();
		
		model.addAttribute("pageMaker", new PageVO(cri, total));
		
		return "emp_list";
	}
	
	@GetMapping("/emp")
	public String emp(Model model) {
		
		model.addAttribute("boards", empService.getDeptEmpList());
		
		return "tables";
	}
	
}
