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
	<h1>emp 리스트</h1>
	<table border="1">
		<tr> <!-- 테이블의 상단에 들어갈 컬럼명들 -->
			<td>사원명</td>
			<td>월급</td>
			<td>등급</td>
		</tr>
		<c:forEach var="salGradeEmp" items="${empSalGradeList}">
			<c:forEach var="dept" items="${salGradeEmp.deptEmpList}">
			<c:forEach var="emp" items="${dept.empList}">
				<tr>
					<td>${emp.ename}</td>

					<!-- 숫자 1000을 1,000으로 표시하는 태그 -->
					<td><fmt:formatNumber value="${emp.sal}" type="number" /></td>

					<td>${salGradeEmp.grade}</td>
				</tr>
				</c:forEach>
			</c:forEach>
		</c:forEach>
	</table>
	
</body>
</html>