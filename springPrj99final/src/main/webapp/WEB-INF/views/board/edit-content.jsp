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
            padding: 30px;
        }
        #center-bot{
            width: 60vw;
            text-align: center;
        }
        #center input, #center textarea{
        	width: 100%;
        	height: 100%;
        	resize: none;
        }
    </style>
    
    <form action="" method="post">
    
     <div id="center">
        <div> <input type="text" name="title" value="${vo.title}"> </div>
        <div>${vo.writer}</div>
        <div>${vo.enrollDate}</div>
        <div>${vo.hit}</div>
        <div id="content-box"><textarea name="content" >${vo.content}</textarea></div>
    </div>
    
    <div id="center-bot">
    	<input type="submit" value="수정하기" class="btn btn-warning">
    </div>
    
    </form>
    
   
