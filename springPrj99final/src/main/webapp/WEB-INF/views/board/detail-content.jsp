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
        #reply-area{
        	width: 60vw;
        	border: 1px solid black;
        	
        }
        #reply-top{
        	border-bottom: 1px dashed black;
        }
        #reply-top>textarea{
        	width: 80%; 
        }
        #reply-top>button{
        	width: 15%;
        }
        #reply-bot{
        	border-bottom: 1px solid gray;
        }
        
        #reply-bot>div{
        	display : inline-block;
        	width: 80%;
        }
        #reply-bot>span{
        	width: 10%;
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
	    <div id="center-bot" >
	        <a href="${root}/board/edit/${vo.no}" class="btn btn-warning">수정하기</a>
	        <a href="${root}/board/delete/${vo.no}" class="btn btn-danger">삭제하기</a>
	    </div>
   </c:if>
   
   <div id="reply-area">
   	<!--댓글 작성 영역  -->   		
   		<div id="reply-top">
   			<textarea id="reply-content" name="content"></textarea>
   			<button  id="reply-btn" class="btn btn-secondary" >댓글작성</button>
   		</div>	
	
	<!--댓글 목록 조회영역  -->
   		<div id="reply-list">
	   		<c:forEach items="${replyList}" var="x">
		   		<div id="reply-bot">
		   			<div>${x.content} </div>
		   			<span>${x.writer}</span>
		   		</div>
	   		</c:forEach>
	   		
   		</div>
   </div>
   
	<script>
		const replyBtn = document.querySelector('#reply-btn');	
		replyBtn.addEventListener('click', function() {
			const replyContent = document.querySelector('#reply-content').value;
			const boardNo = ${vo.no};
			const replyWriterNick = '${sessionScope.loginMember.nick}'; 
			$.ajax({
				url : "${root}/reply/write",
				type : "POST",
				data : {"content" : replyContent,
						"bno" : boardNo	
				},
				success : function(result){
					if(result == "ok") {
						alert("댓글 작성 성공 !!!");	
						const target = document.querySelector('#reply-list')
						$(target).prepend('<div id="reply-bot"><div>' + replyContent + '</div><span>' + replyWriterNick + '</span></div>');
						//기존에 입력한 내용 지우기
						document.querySelector('#reply-content').value = '';
						
					}else {
						alert("댓글 작성 실패 ...");	
					}
					
				},
				error : function() {
					alert("통신에러...");	
				}
			});
		});
		
	</script>