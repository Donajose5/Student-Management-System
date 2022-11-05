<%@ include file="header.jsp"%>

<div class="main">
	<br><br>
	<h1>Delete a Record</h1>
	<br>
	<form action="delete" method="post">

		<div class="form-outline mb-4">
			<label class="form-label">Roll Number 
			</label> <input type="text" name="roll" id="roll" class="form-control" />
		</div>

		<button type="submit" class="btn btn-primary btn-block mb-4">Delete</button>

	</form>
</div>

</body>
</html>