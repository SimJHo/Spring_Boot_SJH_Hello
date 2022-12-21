package edu.global.ex.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/boards")
public class RestBoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public List<BoardVO> list(Model model) {
		log.info("list() ..");

		return boardService.getList(); //JSON 형식으로 출력
	}

}
