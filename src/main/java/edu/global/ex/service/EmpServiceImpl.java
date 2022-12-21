package edu.global.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.global.ex.mapper.EmpMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;
import edu.global.ex.vo.EmpVO;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpMapper empMapper;

	@Override
	public int getTotal() {
		
		return empMapper.getTotalCount();
	}

	@Override
	public List<EmpVO> getList(Criteria cri) {

		return empMapper.getListWithPaging(cri);
	}

	@Override
	public List<EmpVO> getList() {
		
		return empMapper.getList();
	}

	@Override
	public List<DeptVO> getDeptEmpList() {
		
		return empMapper.getDeptEmpList();
	}

}
