<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="hello.servlet.domain.member.Member"%>
<%@ page import="hello.servlet.domain.member.MemberRepository"%>
<html>
<head>
<title>Title</title>
</head>
<body>
	성공ggdgadsfsa
	<ul>
		<li>id=${member.id }</li>
		<li>username=${member.username }</li>
		<li>age=${member.age }</li>
	</ul>
	<a href="/index.html">메인</a>
</body>
</html>