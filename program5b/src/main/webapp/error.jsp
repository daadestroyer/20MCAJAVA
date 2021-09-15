<%@ page isErrorPage="true"%>


<center>

	<h1>Sorry an exception occured!</h1>
	Exception is:
	<%
	Object message = request.getAttribute("messge");
	out.println(message);
	%>
	<%=exception%>
</center>