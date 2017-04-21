<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admins</title>
</head>
<body>
	List of admins
	<table>
		<c:forEach items="${admins}" var="admin">
			<tr>
				<td><c:out value="${admin.name}" /></td>
				<td><c:out value="${admin.address}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>