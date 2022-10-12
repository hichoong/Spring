<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set value="/app99" var="root"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/resources/css/common.css" %>

</head>
<body>
   
   <div id="wrap">

      <aside>
         <%@ include file="/WEB-INF/views/common/sidemenu-content.jsp" %>
      </aside>

      <main>
         <a href="${root}">
            <header> <img width="100%" height="100%" alt="로고이미지" src="${root}/resources/img/lego.png"> </header>
         </a>
         <%@ include file="/WEB-INF/views/member/list-content.jsp" %>
      </main>

      <aside>
         어사이드 ~~~
      </aside>

   </div>

</body>
</html>