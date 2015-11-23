<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!-- JSTL 라이브러리 설정 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
	<!-- JSTL 를 이용하기  sessionScope 안에 member 이라는 정보가 있다면 -->
	<c:if test="${not empty sessionScope.member }">
		[${sessionScope.member.id}]님 환영 합니다 </br>
	</c:if>

	<!-- JSTL 를 이용하기  sessionScope 안에 member 이라는 정보가 없다면 -->
	<c:if test="${empty sessionScope.member }">
		<form action="login" method="post">
			아이디<br>    <input type="text" name="id" /><br> 
			비밀번호<br> <input type="text" name="passwd"><br> 
			<inputtype="submit" value="로그인"> <input type="reset" value="취소">
		</form>
	</c:if>


</center>
