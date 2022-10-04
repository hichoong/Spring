<%@ page contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	pageContext.setAttribute("msg", session.getAttribute("msg"));
	session.removeAttribute("msg");	
%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="/app05/member/join">회원가입</a>
<br>
<a href="/app05/member/login">로그인</a>
<br>
<a href="/app05/member/edit">정보수정</a>
<br>
<a href="/app05/member/quit">탈퇴</a>
	
	
    <c:if test="${not empty msg}">
		<script>
			alert('${msg}')
		</script>
	</c:if>
	
</body>
</html>
