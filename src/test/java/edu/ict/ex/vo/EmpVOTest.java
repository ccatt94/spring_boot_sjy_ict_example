package edu.ict.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmpVOTest {

	@DisplayName("Emp 테스트")
	@Test
	void testEmpVO() {
		EmpVO empVO = new EmpVO();
		
		empVO.setEmpno(1000);
		empVO.setEname("이름");
		empVO.setJob("직업");
		empVO.setMgr(1000);
		empVO.setHiredate(new Date(2024,9,11));
		empVO.setSal(200);
		empVO.setComm(300);
		empVO.setDeptno(10);
		
		System.out.println(empVO.getDeptno());
		System.out.println(empVO.getEname());
		System.out.println(empVO.getJob());
		System.out.println(empVO.getMgr());
		System.out.println(empVO.getHiredate());
		System.out.println(empVO.getSal());
		System.out.println(empVO.getComm());
		System.out.println(empVO.getDeptno());
		
		
		
	}

}
