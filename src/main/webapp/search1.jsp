<%@ include file="header.jsp"%>

<div class="main">
	<br><br>
	<h1>Search for a Record</h1>
	<br>
	<form action="search" method="post">

		<div class="form-outline mb-4">
			<label class="form-label search-label">Roll Number or Mobile Number </label> 
			<input type="text" name="rollormob" id="rollormob" class="form-control" />
		</div>
		<br>
		<button type="submit" class="btn btn-primary btn-block mb-4">Search</button>

	</form>
</div>

</body>
</html>