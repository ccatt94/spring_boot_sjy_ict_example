package edu.ict.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//이름    널? 유형     
//----- -- ------ 
//GRADE    NUMBER 
//LOSAL    NUMBER 
//HISAL    NUMBER 

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalGradeVO {
	private int grade;
	private int losal;
	private int hisal;

	private List<EmpVO> empList;
	//private List<DeptVO> deptList;
	private List<DeptEmpVO> deptEmpList;
}
