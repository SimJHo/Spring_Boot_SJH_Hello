package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;
import edu.global.ex.vo.EmpVO;

public interface EmpService {

	int getTotal();
	List<EmpVO> getList(Criteria cri); 
	List<EmpVO> getList(); 
	
	List<DeptVO> getDeptEmpList();
}
