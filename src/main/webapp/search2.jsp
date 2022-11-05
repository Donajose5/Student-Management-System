<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@page import="stud.Student" %>
<%@ include file="header.jsp"%>

<div class="main">
	<h1>Search for a Record</h1>
	<br>
	
	<form action="search" method="post">

		<div class="form-outline mb-4">
			<label class="form-label">Roll Number or Mobile Number </label> 
			<input type="text" name="rollormob" id="rollormob" value = ${rollormob} class="form-control" readonly />
		</div>
	</form>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Roll No.</th>
				<th scope="col">Name</th>
				<th scope="col">Mail ID</th>
				<th scope="col">Mobile</th>
				<th scope="col">Parent's Name</th>
				<th scope="col">Parent's Mobile</th>
				<th scope="col">Address</th>
				<th scope="col">10th Marks</th>
				<th scope="col">12th Marks</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<Student> students = (ArrayList<Student>)request.getAttribute("students");
			for (Student student : students) {
			%>
			<tr>
				<th scope="row"><%=student.getRoll_no() %></th>
				<td><%=student.getName() %></td>
				<td><%=student.getMail_id() %></td>
				<td><%=student.getMobile() %></td>
				<td><%=student.getParent_name() %></td>
				<td><%=student.getParent_mobile() %></td>
				<td><%=student.getAddress() %></td>
				<td><%=student.getXth_mark() %></td>
				<td><%=student.getXiith_mark() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
	<br><br><br>
	<form action="dashboard.jsp">
	<button type="submit" class="btn btn-primary btn-block mb-4">Back to Dashboard</button>
	</form>
</div>

</body>
</html>>