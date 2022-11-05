<%@ include file="header.jsp"%>


<div class="main">
	<h1>Update a Record</h1>
	<br>
	<form action="update" method="post">

		<div class="form-outline mb-4">
			<label class="form-label">Roll Number </label> 
			<input type="text" name="roll" id="roll" value= ${student.getRoll_no()} class="form-control" readonly /> <br><br>
			<label class="form-label">Name </label> 
			<input type="text" name="name" id="name" value= ${student.getName()} class="form-control" /><br><br>
			<label class="form-label">Mail ID </label> 
			<input type="email" name="mail" id="mail" value=${student.getMail_id()} class="form-control" /><br><br>
			<label class="form-label">Mobile Number </label> 
			<input type="text" name="mobile" id="mobile" value=${student.getMobile()} class="form-control" /><br><br>
			<label class="form-label">Parent Name </label> 
			<input type="text" name="pname" id="pname" value=${student.getParent_name()} class="form-control" /><br><br>
			<label class="form-label">Parent Mobile Number </label> 
			<input type="text" name="pmob" id="pmob" value=${student.getParent_mobile()} class="form-control" /><br><br>
			<label class="form-label">Address </label> 
			<input type="text" name="address" id="address" value=${student.getAddress()} class="form-control" /><br><br>
			<label class="form-label">10th Marks </label> 
			<input type="number" name="xth" id="xth" value=${student.getXth_mark()} class="form-control" /><br><br>
			<label class="form-label">12th Marks </label> 
			<input type="number" name="xiith" id="xiith" value=${student.getXiith_mark()} class="form-control" /><br><br>
		</div>

		<button type="submit" class="btn btn-primary btn-block mb-4">Insert</button>

	</form>
</div>

</body>
</html>