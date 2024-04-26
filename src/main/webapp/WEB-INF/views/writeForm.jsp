<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <h1>글 작성하기</h1>
        <hr>
        <form action="write" method="post">
            게시물제목 : <input type="text" name="title"><br>
            게시물 내용 : <input type="text" name="content"> <br>
            작성자 : <input type="text" name="writer"><br>
            작성일자 : <input type="text" name="regdate"><br>
            <input type="submit" value="등록하기">
        </form>

    </body>

    </html>