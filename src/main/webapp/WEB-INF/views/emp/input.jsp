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
	<h1>사원 정보 입력</h1>
	<hr>
	<form action="/emp/list" method="post">
		사원번호 : <input type="text" name="empno"><br>
		사원이름 : <input type="text" name="ename"><br>
		사원직급 : <input type="text" name="job"><br>
		<c:forEach var="emp" items="${empList}">
		매니저 : <select id="mgr" name=mgr>
			<c:forEach var="emp" items="${empList}">
					<option value="" selected disabled>매니저 선택</option>
					<option value="${emp.mgr}">(${emp.mgr})<c:when test="${emp.mgr eq emp.empno}">${emp.ename}</c:when></option>
			</c:forEach>		
				</select> 
		</c:forEach>
		입사일 : <input type="text" name="hiredate"><br>
		급여 : <input type="text" name="sal"><br>
		커미션 : <input type="text" name="comm"><br>
		부서 : <select id="deptno" name=deptno>
					<option value="" selected disabled>부서 선택</option>
					<option value="10">(10)ACCOUNTING</option>
					<option value="20">(20)RESEARCH</option>
					<option value="30">(30)SALES</option>
					<option value="40">(40)OPERATIONS</option>
				</select> 
		<input type="submit" value="입력">
	</form>
	
	<c:forEach var="emp" items="${empList}">
		<tr>
			<td>${emp.empno}</td>
			<td>${emp.ename}</td>
			<td>${emp.job}</td>
			<td>${emp.mgr}</td>
			<td>${emp.hiredate}</td>
			
			<!-- 숫자 1000을 1,000으로 표시하는 태그 -->
			<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
			
			<td>${emp.comm}</td>
			<td>${emp.deptno}</td>
		</tr>
		</c:forEach>
	
</body>
</html>