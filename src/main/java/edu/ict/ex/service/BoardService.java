package edu.ict.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.ict.ex.vo.BoardVO;

//command 계층 = 비지니스 로직
@Service
public interface BoardService {

   List<BoardVO> getList();
   BoardVO get(int bno);
   
   int remove(int bno);
   
   int write(String bname, String btitle, String bcontent);
   
   int modify(int bno, String bname, String btitle, String bcontent);
}
