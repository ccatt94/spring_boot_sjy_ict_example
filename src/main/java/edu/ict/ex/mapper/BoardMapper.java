package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.vo.BoardVO;

//마이바티스용 인터페이스라는걸 알려주는 어노테이션
@Mapper
public interface BoardMapper {

	public List<BoardVO> getList();
	BoardVO read(int bno);
	
	//게시판 삭제 == 삭제된 갯수 리턴
	int delete(int bno);
	
	//게시판 쓰기
	int write(String bname, String btitle, String bcontent);
	
	//게시판 수정
	int modify(int bno, String bname, String btitle, String bcontent);
}
