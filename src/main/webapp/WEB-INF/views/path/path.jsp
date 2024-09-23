<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<body>

	<h1>절대 경로 상대 경로 테스트</h1>
	
	<img src="${pageContext.request.contextPath}/Eshopper/images/404/404.png"><br>
	
	<!-- context 이름 = 프로젝트 이름(spring_boot_sjy_ict_example) -->
	<img src="${pageContext.request.contextPath}/Eshopper/images/404/404.png">
	
</body>
</html>