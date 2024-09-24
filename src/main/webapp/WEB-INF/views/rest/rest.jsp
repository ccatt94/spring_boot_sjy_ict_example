<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/Eshopper/js/board.js"></script>
<script type="text/javascript">
   $(document).ready(function() {

      let board = boardService();
      //board.list();
      //board.get(1021)

      let boardObj = {
    	 bid : 1055,
         bname : "아햏햏",
         bcontent : "수정",
         btitle : "음매에 ~~~"
      }

      //board.add(boardObj);
      
      //board.del(1086);
      //board.del(1080);
      board.update(boardObj); //type : PUT
      

   });
</script>

<script type="text/javascript">
   $(document).ready(function() {

      boardService();

   });
</script>


<script type="text/javascript">
   $(document).ready(function() {

      function list() {

         $.ajax({
            type : "GET",
            url : "${pageContext.request.contextPath}/boards/list",
            success : function(result) {
               console.log(result);
            },
            error : function(e) {
               console.log(e);
            }

         });
      }

      function get(id) {

         $.ajax({
            type : "GET",
            url : "${pageContext.request.contextPath}/boards/" + id,
            success : function(result) {
               console.log(result);
            },
            error : function(e) {
               console.log(e);
            }

         });

      }

      get(1021)

      //list();

   });
</script>

</head>
<body>
   <h1>Restful 게시판 연습</h1>




</body>
</html>