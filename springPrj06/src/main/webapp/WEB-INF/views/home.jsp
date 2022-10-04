<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" language="java"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

	<a href="/app06/member/join">회원가입</a>
	<br>
	<a href="/app06/member/login">로그인</a>
	
	<c:if test="${ not empty msg }">
		<script type="text/javascript">
			alert('${msg}')
		</script>
		<c:remove var="msg" scope="session"/>
	</c:if>
</body>
</html>
