package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmpMapperTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Disabled
	@Test
	void testGetList() {
		for (EmpVO vo : empMapper.getList()) {
			System.out.println(vo);
			
		}
	}
	
	@Disabled
	@Test
	void testGetEmpDeptList() {
		for (EmpVO vo : empMapper.getEmpDeptList()) {
			System.out.println(vo);
			
		}
	}
	
	@Disabled
	@Test
	void testInsert() {
		
		//INSERT INTO EMP  VALUES (1111,'홍길동','CLERK',7369,'2024-09-24',800,8000,10)
		EmpVO emp = new EmpVO();
		emp.setEmpno(2000);
		emp.setEname("홍길순");
		emp.setJob("CLERK");
		emp.setMgr(7369);
		//emp.setHiredate2("2024-09-24");
		emp.setSal(800);
		emp.setComm(2000);
		emp.setDeptno(10);
	
		empMapper.insert(emp);
		
		
		for (EmpVO vo : empMapper.getList()) {
			System.out.println(vo);
			
		}
	}
	
	@Disabled
	@Test
	void testGetListWithPaging() {
		
		Criteria criteria = new Criteria();
		
		criteria.setAmount(10);
		criteria.setPageNum(1);
		
		List<EmpVO> list = empMapper.getListWithPaging(criteria);
		System.out.println(list);
	}
	
	@Disabled
	@Test
	void testGetDeptEmpList() {
		System.out.println(empMapper.getDeptEmpList());
	}
	
	@Disabled
	@Test
	void testGetEmpSalGradeList() {
		System.out.println(empMapper.getEmpSalGradeList());
	}
	
	@Test
	@Disabled
	void testGetEmpDeptSalGradeList() {
		System.out.println(empMapper.getEmpDeptSalGradeList());
	}
	
	@Disabled
	@Test
	void testGetEmpOneDeptList() {
		System.out.println(empMapper.getEmpOneDeptList());
	}
	
	@Disabled
	@Test
	void testGetOneSalGradeList() {
		System.out.println(empMapper.getOneSalGradeList());
	}
	
	@Disabled
	@Test
	void testGetEmpSalgrade() {
		System.out.println(empMapper.getEmpSalgrade());
	}
	
	@Test
	void testGetEmpDeptSalgrade() {
		System.out.println(empMapper.getEmpDeptSalgrade());
	}
	
	
}
