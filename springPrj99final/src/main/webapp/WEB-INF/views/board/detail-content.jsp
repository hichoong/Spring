<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <style>
        #center{
            width: 60vw;
            height: 60vh;
            border: 5px solid black;
            display: grid;
            grid-template-columns:  5fr 3fr 3fr 1fr;
            grid-template-rows: 30px;
        }
        #center>div{
            border: 1px solid black;
            
        }
        #content-box{
            grid-column: span 4;
            padding-top: 30px;
        }
        #center-bot{
            width: 60vw;
            text-align: center;
        }
    </style>
    
    <div id="center">
        <div>${vo.title}</div>
        <div>${vo.writer}</div>
        <div>${vo.enrollDate}</div>
        <div>${vo.hit}</div>
        <div id="content-box">${vo.content}</div>
    </div>

	<c:if test="${vo.writer eq loginMember.nick}">
	    <div id="center-bot" class="btn btn-warning">
	        <a href="${root}/board/edit/${vo.no}">수정하기</a>
	        <a href="${root}/board/delete/${vo.no}">삭제하기</a>
	    </div>
   </c:if>