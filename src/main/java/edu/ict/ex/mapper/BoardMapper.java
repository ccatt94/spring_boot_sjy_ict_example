package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import edu.ict.ex.vo.BoardVO;

//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface BoardMapper {

	public List<BoardVO> getList();
	BoardVO read(int bno);
	
	//게시판 삭제 == 삭제된 갯수 리턴
	int delete(int bno);
	
	
	//게시판 작성
	int insertBoard(@Param("board") BoardVO boardVO);
	//파라미터로 객체 여러개 넘길때
	//int insertBoard(@Param("board") BoardVO boardVO, @Param("emp") EmpVO empVO);
	
	//게시판 작성(self)
	//int write(String bname, String btitle, String bcontent);
	
	
	//게시판 수정
	int updateBoard(BoardVO boardVO);
	//int modify(int bno, String bname, String btitle, String bcontent);
}
