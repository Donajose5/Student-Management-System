
const form = document.getElementById('loginform')
const username = document.getElementById('user')
const password = document.getElementById('pass')

form.addEventListener('submit', e => {
	e.preventDefault();
	
	checkInputs();
});

function checkInputs() {
	
	const usernamevalue = username.value.trim();
	const passwordvalue = password.value.trim();
	
	if (usernamevalue=='') {
		setErrorFor(username, 'Username cannot be blank');
	}
	else {
		setSuccessFor(username);
	}
}

function setErrorFor(input, message) {
	const forControl = input.parentElement;
	const small = formControl.querySelector('small');
	small.innerText = message;
	formControl.className = 'form-outline mb-4 error';
}

function setSuccessFor(input) {
	const forControl = input.parentElement;
	formControl.className = 'form-outline mb-4 success';
}