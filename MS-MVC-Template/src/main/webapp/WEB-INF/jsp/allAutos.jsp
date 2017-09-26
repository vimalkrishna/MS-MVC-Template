<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>All Auto page</h1>

<ul>
<c:forEach items="${autos}" var="auto">
   <li>${auto}</li>
</c:forEach>
</ul>