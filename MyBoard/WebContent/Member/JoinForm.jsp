<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3>ȸ �� �� ��</h3>

	<form action="Member.do?cmd=MemberJoin" method="post">
		<table align="left">
			<tr>
				<td>���̵� :</td>
				<td><input type="text" name="id" /></td>
			</tr>

			<tr>
				<td>��й�ȣ :</td>
				<td><input type="text" name="pass" /></td>
			</tr>

			<tr>
				<td>�̸� :</td>
				<td><input type="text" name="name" /></td>
			</tr>

			<tr>
				<td>���� :</td>
				<td><input type="text" name="age" /></td>
			</tr>

			<tr>
				<td>�ּ� :</td>
				<td><input type="text" name="address" /></td>
			</tr>

			<tr>
				<td>��ȭ��ȣ :</td>
				<td><input type="text" name="ph1"></td>

				<td><input type="text" name="ph2"></td>

				<td><input type="text" name="ph3"></td>
			</tr>
			<tr>
				<td>��� :</td>
				<td><TEXTAREA rows="5" cols="20" name="hobby"></TEXTAREA></td>
			</tr>
			<tr>
				<td><input type="submit" value="ȸ������"></td>
				<td><input type="reset" value="���"></td>
			</tr>
		</table>

	</form>
</body>
</html>