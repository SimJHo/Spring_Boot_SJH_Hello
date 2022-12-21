package edu.global.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.DeptVO;

@SpringBootTest
class EmpServiceImplTest {
	
	@Autowired
	private EmpService empService;

	@Test
	void test() {
		List<DeptVO> vos = empService.getDeptEmpList();
		
		for(DeptVO vo : vos) {
			System.out.println(vo);
		}
	}

}
