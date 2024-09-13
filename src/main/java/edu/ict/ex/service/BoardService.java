package edu.ict.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;

//command 계층 = 비지니스 로직
@Service
public interface BoardService {

   List<BoardVO> getList();
   BoardVO get(int bno);
   
   int remove(int bno);
   
   int writeBoard(BoardVO boardVO);
   //int write(String bname, String btitle, String bcontent);
   
   int modifyBoard(BoardVO boardVO);
   //int modify(int bno, String bname, String btitle, String bcontent);

   int upHit(BoardVO board);
   
   //댓글
   void writeReply(BoardVO board);
   
   //페이징 처리 함수
   int getTotal();
   List<BoardVO> getListWithPaging(Criteria cri);
   
}
