package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.EmpDeptVO;
import edu.ict.ex.vo.EmpGradeVO;
import edu.ict.ex.vo.EmpSalgradeVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalGradeVO;

//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface EmpMapper {

	public List<EmpVO> getList();
	public int insert(EmpVO empVO);
	
	//조인처리 첫번째 방법
	public List<EmpVO> getEmpDeptList(); 
	
	//조인처리 두번째 방법
	public List<DeptEmpVO> getDeptEmpList(); 
	
	//조인처리 일대일 처리
	public List<EmpDeptVO> getEmpOneDeptList();
	
	// 페이징 관련
	int getTotalCount();
	List<EmpVO> getListWithPaging(Criteria cri);
	
	//salgrade 조인 처리(일대다)
	public List<SalGradeVO> getEmpSalGradeList(); 
	
	//salgrade, dept, emp 조인 처리(일대다)
	public List<SalGradeVO> getEmpDeptSalGradeList(); 
	
	//salgrade, dept, emp 일대일 처리
	public List<EmpGradeVO> getOneSalGradeList();
	
	List<EmpSalgradeVO> getEmpSalgrade();
	
}
