<%@ page errorPage="error.jsp"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
<body>
	<center>
		<h1>Using GET Method to Read Form Data</h1>

		<%-- Accept the parameters --%>
		<%
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		int age = Integer.parseInt(request.getParameter("age"));
		%>


		<%-- conditional statements --%>
		<%
		if (fname.equals("")) {
			request.setAttribute("message", "first name can't be null");
			throw new Exception();
		} else if (lname.equals("")) {
			request.setAttribute("message", "last name can't be null");
			throw new Exception();
		} else if (age == 0) {
			request.setAttribute("message", "age can't be zero");
			throw new Exception();

		} else if ( age < 0) {
			request.setAttribute("message", "age can't be negative ");
			throw new Exception();

		} else {
		%>
		First Name:
		<%=fname%><br> Last Name:
		<%=lname%><br> Age:
		<%=age%><br>
		<%
		}
		%>
	
</body>
</body>
</html>