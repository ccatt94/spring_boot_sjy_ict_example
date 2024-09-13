package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;
	
	@Disabled
	@Test
	void testGetList() {
		System.out.println(boardMapper.getList());

		for (BoardVO vo : boardMapper.getList()) {
			System.out.println(vo);
		}
	}
	
	@Disabled
	@Test
	void testRead() {
		System.out.println(boardMapper.read(20));
	}
	
	@Disabled
	@Test
	void testDelete() {
		
		int count = boardMapper.delete(20);
		
		System.out.println("삭제된 갯수 " + count);
		
		if(boardMapper.read(20) == null) {
			System.out.println("제대로 삭제됨");
		}
		
	}
	
	
	//게시판 작성 (self)
//	@Disabled
//	@Test
//	void testWrite() {
//		int count = boardMapper.write("홍길동", "제목", "내용");
//		System.out.println("삽입된 갯수 " + count);
//
//	}

	
	@Disabled
	@Test
	void testUpdate() {
		
		BoardVO board = new BoardVO();
		board.setBid(44);
		board.setBname("홍길동");
		board.setBtitle("제목");
		board.setBcontent("내용");
		
		int count = boardMapper.updateBoard(board);
		
		System.out.println("업데이트된 갯수 " + count);
		
		System.out.println(boardMapper.read(44));
	}
//	@Test
//	void testModify() {
//		int count = boardMapper.modify(4,"홍길동", "제목", "내용");
//		System.out.println("수정된 갯수 " + count);
//	}
	
	@Test
	void testGetListWithPaging() {
		
		Criteria criteria = new Criteria();
		
		criteria.setAmount(10);
		criteria.setPageNum(3);
		
		List<BoardVO> list = boardMapper.getListWithPaging(criteria);
		System.out.println(list);
	}
	
	

}
