<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <style>
        #login-form{
            width: 100%;
            height: 100%;
        }
        #login-area-outer{
            width: 100%;
            height: 60%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        #login-area{
            width: 40%;
            height: 40%;
            border: 3px solid gray;
            display: grid;
            grid-template-rows: 1fr 1fr 0.5fr 1.5fr;
            border-radius: 10%;
        }
        #login-area > div{
            width: 100%;
            height: 100%;
        }
        .login-input-box{
            display: flex;
            justify-content: center;
        }
        .login-input-box.id-outer{
            align-items: flex-end;
        }
        .login-input-box.pwd-outer{
            align-items: flex-start;
        }
        .login-input-box > input {
            width: 80%;
            height: 80%;
        }
        #login-area input[name="id"],
        #login-area input[name="pwd"]
        {
            border: none;
            border-bottom: 1px dashed gray;
        }
        input[name="saveId"]{
            width: 20px;
            height: 20px;
        }
        input[type="submit"]{
            width: 30%;
            border-radius: 30px;
        }
        .login-submit-box{
            width: 100%;
            height: 100%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
       
    </style>

    <form action="" method="post" id="login-form">
        <div id="login-area-outer">
            <div id="login-area">
                <div class="login-input-box id-outer">
                    <input type="text" name="id" placeholder="아이디" value="${cookie.rid.value}">
                </div>
                <div class="login-input-box pwd-outer">
                    <input type="password" name="pwd" placeholder="비밀번호">
                </div>
                <div class="login-check-box">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label>아이디 저장 <input type="checkbox" name="saveId" value="true"></label>
                </div>
                <div class="login-submit-box">
                    <input type="submit" value="로그인">
                </div>
            </div>
        </div>
    </form>