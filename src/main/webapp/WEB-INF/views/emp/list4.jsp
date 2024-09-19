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
			<td>사원번호</td>
			<td>사원명</td>
			<td>직업</td>
			<td>매니저</td>
			<td>입사일자</td>
			<td>급여</td>
			<td>커미션</td>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
		</tr>
		<c:forEach var="deptEmp" items="${empDeptList}">
			<c:forEach var="emp" items="${deptEmp.empList}">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.mgr}</td>
					<td>${emp.hiredate}</td>

					<!-- 숫자 1000을 1,000으로 표시하는 태그 -->
					<td><fmt:formatNumber value="${emp.sal}" type="number" /></td>

					<td>${emp.comm}</td>
					<td>${emp.deptno}</td>
					<td>${deptEmp.dname}</td>
					<td>${deptEmp.loc}</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
	
	
</body>
</html>