<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>



<%
	String pagefile=request.getParameter("page");

	if(pagefile==null) // null 값인 경우 기본은 게시판 설정
	{
		pagefile="/Board/BoardList.jsp";
	}
	System.out.println(pagefile);
%>
<html>
<head>
<title>MVC Board</title>
</head>
<body>
<table width="960" border="1" color="gray" align="center">
	<tr>
		<td height="43" colspan=3 align=left>
			<jsp:include page="top.jsp"/>
		</td>
	</tr>
	<tr>
		<td width="15%" align=right valign=top><br>
			<jsp:include page="login.jsp"/>
		</td>
		<td colspan=2 align=center>
			<jsp:include page='<%=pagefile%>'/>
		</td>
	</tr>
	<tr>
		<td width="100%" height="40" colspan="3">
			<jsp:include page="bottom.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>
