<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Etudiant</title>
<link rel="stylesheet" type="text/css" href="sign.css">
</head>
<body>
   <div class="wrapper">
		<div class="title-text">
			<div class="title login">Login</div>
			<div class="title signup">Sign up</div>
		</div>
		
		<div class="form-container">
			<div class="slide-controls">
				<input type="radio" name="slider" id="login" checked="checked">
				<input type="radio" name="slider" id="signup">
				<label for="login" class="slide login">Login</label>
				<label for="signup" class="slide signup">Sign up</label>
				<div class="slide-tab"></div>
		    </div>
			<div class="form-inner">
				<form action="/EtudiantServlet" class="login" method="post">
					<div class="field">
						<input type="text" placeholder="Email Adress" required>
					</div>
					<div class="field">
						<input type="password" placeholder="Password" required>
					</div>
					<div class="pass-link"><a href="#">Forgot your password?</a></div>
					<div class="field">
						<input type="submit" value="Login">
					</div>
					<div class="signup-link">Not a member?<a href="#"> Sign up Now</a></div>
				</form>
				<form action="/EtudiantServlet" class="signup" method="post">
					<div class="field">
						<input type="text" placeholder="Full Name" required>
					</div>
					<div class="field">
						<input type="text" placeholder="Email Adress" required>
					</div>
					<div class="field">
						<input type="password" placeholder="Password" required>
					</div>
					<div class="field">
						<input type="submit" value="Sign Up">
					</div>
				</form>
			</div>
		</div>	
	</div>
	<script>
      const loginText = document.querySelector(".title-text .login");
      const loginForm = document.querySelector("form.login");
      const loginBtn = document.querySelector("label.login");
      const signupBtn = document.querySelector("label.signup");
      const signupLink = document.querySelector("form .signup-link a");
      signupBtn.onclick = (()=>{
        loginForm.style.marginLeft = "-50%";
        loginText.style.marginLeft = "-50%";
      });
      loginBtn.onclick = (()=>{
        loginForm.style.marginLeft = "0%";
        loginText.style.marginLeft = "0%";
      });
      signupLink.onclick = (()=>{
        signupBtn.click();
        return false;
      });
    </script>
</body>
</html>