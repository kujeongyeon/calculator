<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% request.setCharacterEncoding("euc-kr"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>layout</title>
</head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
<td colspan="2" align="left">
<jsp:include page="top.jsp">
</td>
<td width="15%" align="right" valign="top">
<jsp:include page="left.jsp">
</td>
<td width="85%" align="center">
<jsp:include page="right.jsp">
</td>
</tr>
<tr>
<td colspan="2" align="center">
<jsp:include page="bottom.jsp">
</tr>
</table>
</body>
</html>