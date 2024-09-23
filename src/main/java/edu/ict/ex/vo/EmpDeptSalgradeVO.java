package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpDeptSalgradeVO {
	private EmpVO emp;
	private SalGradeVO salgrade;
	private DeptVO dept;

	
	public int getNum() {
		return (int) (Math.random()*6+1);
	}
	
}
