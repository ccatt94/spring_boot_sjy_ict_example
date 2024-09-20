<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 일대일 조인 리스트</h1>
	<table border="1">
		<tr> <!-- 테이블의 상단에 들어갈 컬럼명들 -->
			<td>사원명</td>
			<td>급여</td>
			<td>등급</td>
		</tr>
		<c:forEach var="vo" items="${empList}">
		<tr>
			<td>${vo.emp.ename}</td>
			
			<!-- 숫자 1000을 1,000으로 표시하는 태그 -->
			<td><fmt:formatNumber value="${vo.emp.sal}" type="number"/></td>
			
			<td>${vo.salgrade.grade}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>