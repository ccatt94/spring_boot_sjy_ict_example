package edu.ict.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.service.BoardService;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		log.info("list()..");
		
		model.addAttribute("boards", boardService.getList());
		
		return "board/list";
	}
	
	//localhost:8282/board/content_view?bid=28
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		
		log.info("content_view()..");
		
		model.addAttribute("content_view", boardService.get(boardVO.getBid()));
		
		return "board/content_view";
	}
	
	//localhost:8282/board/delete?bid=28
	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		
		log.info("delete()..");
		
		int bid = boardVO.getBid();
		boardService.remove(bid);
		
		return "redirect:/board/list";
	}
	
	//localhost:8282/board/write_view
	@GetMapping("/write_view")
	public String write_view() {
		
		log.info("write_view()..");
				
		return "board/write_view";
	}
	
	//localhost:8282/board/delete?bid=28
	@PostMapping("/write")
	public String write(BoardVO boardVO) {
		
		log.info("write()..");
		
		String bname = boardVO.getBname();
		String btitle = boardVO.getBtitle();
		String bcontent = boardVO.getBcontent();
		
		
		
		boardService.write(bname, btitle, bcontent);
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		
		log.info("modify()..");
		
		int bid = boardVO.getBid();
		String bname = boardVO.getBname();
		String btitle = boardVO.getBtitle();
		String bcontent = boardVO.getBcontent();
		
		boardService.modify(bid, bname, btitle, bcontent);
		
		return "redirect:/board/list";
	}
	
}
