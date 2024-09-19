package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmpMapperTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Test
	void testGetList() {
		for (EmpVO vo : empMapper.getList()) {
			System.out.println(vo);
			
		}
	}

	@Test
	void testInsert() {
		
		EmpVO emp = new EmpVO();
		emp.setEmpno(2000);
		emp.setEname("홍길순");
		emp.setJob("CLERK");
		emp.setMgr(7369);
		emp.setHiredate2("2024-09-24");
		emp.setSal(800);
		emp.setComm(2000);
		emp.setDeptno(10);
	
		empMapper.insert(emp);
		
		
		for (EmpVO vo : empMapper.getList()) {
			System.out.println(vo);
			
		}
	}
	
}
