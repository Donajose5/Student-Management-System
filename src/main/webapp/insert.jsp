<%@ include file="header.jsp"%>

<div class="main">
	<h1>Insert a Record</h1>
	<br>
	<form action="insert" method="post">

		<div class="form-outline mb-4">
			<label class="form-label">Roll Number </label> 
			<input type="text" name="roll" id="roll" class="form-control" /> <br><br>
			<label class="form-label">Name </label> 
			<input type="text" name="name" id="name" class="form-control" /><br><br>
			<label class="form-label">Mail ID </label> 
			<input type="email" name="mail" id="mail" class="form-control" /><br><br>
			<label class="form-label">Mobile Number </label> 
			<input type="text" name="mobile" id="mobile" class="form-control" /><br><br>
			<label class="form-label">Parent Name </label> 
			<input type="text" name="pname" id="pname" class="form-control" /><br><br>
			<label class="form-label">Parent Mobile Number </label> 
			<input type="text" name="pmob" id="pmob" class="form-control" /><br><br>
			<label class="form-label">Address </label> 
			<input type="text" name="address" id="address" class="form-control" /><br><br>
			<label class="form-label">10th Marks </label> 
			<input type="number" name="xth" id="xth" class="form-control" /><br><br>
			<label class="form-label">12th Marks </label> 
			<input type="number" name="xiith" id="xiith" class="form-control" /><br><br>
		</div>

		<button type="submit" class="btn btn-primary btn-block mb-4">Insert</button>

	</form>
</div>

</body>
</html>