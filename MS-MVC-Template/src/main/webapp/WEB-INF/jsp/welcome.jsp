<%@ page contentType="text/html;charset=utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

Hi ${dateTime}

<c:forEach var="i" begin="1" end="7">
	<p>${i} </p>
</c:forEach>