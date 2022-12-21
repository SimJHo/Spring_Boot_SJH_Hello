package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	
	int getTotalCount();
	List<EmpVO> getListWithPaging(Criteria cri);
	List<EmpVO> getList();
	
//	@Select("SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO") //xml에서 구현할 필요 없음, 테스트용으로 씀
//	List<EmpDeptVO> getEmpDeptList();
	
	List<DeptVO> getDeptEmpList();
	
}
