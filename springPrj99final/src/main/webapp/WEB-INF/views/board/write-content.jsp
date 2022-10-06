<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <style>
        #center{
            width: 60vw;
            height: 60vh;
            border: 5px solid black;  
            display: grid;
            grid-template-columns: 1fr 5fr;
            grid-template-rows: 1fr 8fr 1fr;
            justify-items: center;
            align-items: center;
        }
        #center input, #center textarea{
            width: 80%;
            height: 90%;
        }
        #center-bot{
            grid-column: span 2;
            width: 150px;
        }
    </style>

    <form action="" method="post">
        
        <div id="center">
        
            <div>제목</div>
            <input type="text" name="title">

            <div>내용</div>
           <textarea name="content"></textarea>
            
            <div id="center-bot" ><input type="submit" value="작성하기" class="btn btn-primary"></div>

        </div>
    </form>