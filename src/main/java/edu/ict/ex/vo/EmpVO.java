package edu.ict.ex.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import oracle.sql.DATE;

//이름       널?       유형           
//-------- -------- ------------ 
//EMPNO    NOT NULL NUMBER(4)    
//ENAME             VARCHAR2(10) 
//JOB               VARCHAR2(9)  
//MGR               NUMBER(4)    
//HIREDATE          DATE         
//SAL               NUMBER(7,2)  
//COMM              NUMBER(7,2)  
//DEPTNO            NUMBER(2)  

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	//날짜 input 입력을 위해서
	private String hiredate2;
	
	private String dname; //부서명
	private String loc; //위치

}
