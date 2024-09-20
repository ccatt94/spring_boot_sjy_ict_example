package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.page.PageVO;
import edu.ict.ex.service.DeptService;
import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.EmpVO;

@Controller
@RequestMapping("/Eshopper")
public class ShopController {

	@Autowired
	private EmpService empService;
	
	
	@GetMapping("/index")
	public String index(Model model) {
		
		System.out.println("list7()..");
		
		model.addAttribute("empList", empService.getEmpDeptSalgrade());
		
		return "Eshopper/index";
	}
}
