<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!-- JSTL ���̺귯�� ���� -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
	<!-- JSTL �� �̿��ϱ�  sessionScope �ȿ� member �̶�� ������ �ִٸ� -->
	<c:if test="${not empty sessionScope.member }">
		[${sessionScope.member.id}]�� ȯ�� �մϴ� </br>
	</c:if>

	<!-- JSTL �� �̿��ϱ�  sessionScope �ȿ� member �̶�� ������ ���ٸ� -->
	<c:if test="${empty sessionScope.member }">
		<form action="login" method="post">
			���̵�<br>    <input type="text" name="id" /><br> 
			��й�ȣ<br> <input type="text" name="passwd"><br> 
			<inputtype="submit" value="�α���"> <input type="reset" value="���">
		</form>
	</c:if>


</center>
