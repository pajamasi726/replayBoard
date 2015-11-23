<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3>회 원 가 입</h3>

	<form action="Member.do?cmd=MemberJoin" method="post">
		<table align="left">
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="id" /></td>
			</tr>

			<tr>
				<td>비밀번호 :</td>
				<td><input type="text" name="pass" /></td>
			</tr>

			<tr>
				<td>이름 :</td>
				<td><input type="text" name="name" /></td>
			</tr>

			<tr>
				<td>나이 :</td>
				<td><input type="text" name="age" /></td>
			</tr>

			<tr>
				<td>주소 :</td>
				<td><input type="text" name="address" /></td>
			</tr>

			<tr>
				<td>전화번호 :</td>
				<td><input type="text" name="ph1"></td>

				<td><input type="text" name="ph2"></td>

				<td><input type="text" name="ph3"></td>
			</tr>
			<tr>
				<td>취미 :</td>
				<td><TEXTAREA rows="5" cols="20" name="hobby"></TEXTAREA></td>
			</tr>
			<tr>
				<td><input type="submit" value="회원가입"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>

	</form>
</body>
</html>