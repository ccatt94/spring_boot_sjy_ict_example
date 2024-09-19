package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.repository.DeptDao;
import edu.ict.ex.repository.EmpDao;
import edu.ict.ex.vo.BoardVO;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;
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


}
