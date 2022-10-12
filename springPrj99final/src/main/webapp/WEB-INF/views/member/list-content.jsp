<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	
    <style>
    #main {
	    width : 100%;
	    height : 60vh;
	    border: 5px solid black;
	    display: grid;
        grid-template-columns: repeat(5, 100px);
        grid-template-rows: repeat(2, 130px);
        justify-content: center;
        align-content: center;
        gap: 100px;
	}
    #main>div{
        border : 1px solid black;
        
    }
    .gallery-img-box{
        width: 100px;
        height: 100px;
    }
    </style>
    
    
   	<div id="main">
	    <c:forEach items="${voList}" var="x">
	        <div>
	            <div class="gallery-img-box">
	                <img src="${root}/resources/upload/profile/${x.fileName}" alt="${x.nick} 회원의 사진" width="100%" height="100%">
	            </div>
                <span>${x.nick}</span>            
	        </div> 
	    </c:forEach>
    </div>
    
    
    
    
    