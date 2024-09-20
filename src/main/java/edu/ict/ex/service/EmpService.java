package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.repository.DeptDao;
import edu.ict.ex.repository.EmpDao;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpDeptVO;
import edu.ict.ex.vo.EmpGradeVO;
import edu.ict.ex.vo.EmpSalgradeVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalGradeVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmpService {

   @Autowired
   private EmpMapper empMapper;
   //private EmpDao dao;
   
   public List<EmpVO> getList(){
	   System.out.println("getList()..");
	   return empMapper.getList();
   }
   
   public int insert(EmpVO empVO){
		System.out.println("insert() ..");
		return empMapper.insert(empVO);
	}
   
	public int getTotal() {
		log.info("getTotal()..");
		return empMapper.getTotalCount();
	}

	public List<EmpVO> getListWithPaging(Criteria cri) {
		return empMapper.getListWithPaging(cri);
	}
	
	//조인 처리한 결과
	public List<EmpVO> getEmpDeptList() {
		return empMapper.getEmpDeptList();
	}
	
	//조인 처리한 결과
	public List<DeptEmpVO> getDeptEmpList() {
		return empMapper.getDeptEmpList();
	}

	//일대다 처리
	public List<SalGradeVO> getEmpSalGradeList() {
		return empMapper.getEmpSalGradeList();
	}
	
	//일대다 처리
	public List<SalGradeVO> getEmpDeptSalGradeList() {
		return empMapper.getEmpDeptSalGradeList();
	}

	//Emp Dept 일대일 처리
	public List<EmpDeptVO> getEmpOneDeptList() {
		return empMapper.getEmpOneDeptList();
	}
	
	//일대일 처리
	public List<EmpGradeVO> getOneSalGradeList() {
		return empMapper.getOneSalGradeList();
	}
	
	//조인 일대일 처리
	public List<EmpSalgradeVO> getEmpSalgrade() {
		return empMapper.getEmpSalgrade();
	}
	
	
}
