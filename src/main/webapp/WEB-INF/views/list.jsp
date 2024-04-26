<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>목록보기</h1>
            <a href="writeForm">글 작성하기</a>
            <hr>
            <c:forEach var="list" items="${list}">
               ${list.bno} / <a href="detail?bno=${list.bno}">${list.title}</a>/ ${list.content} / ${list.writer} / ${list.regdate}<br>
            </c:forEach>
        </body>

        </html>