<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title>MOBAN</title>
<link href="css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="App Loction Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements"./>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</script>
<!--webfonts-->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--//webfonts-->
</head>
<body>
	<h1>App Location Form</h1>
		<div class="app-location">
			<h2>Welcome to Locaticus</h2>
			<div class="line"><span></span></div>
			<div class="location"><img src="images/location.png" class="img-responsive" alt="" /></div>
			<form action="<%=basePath %>user/login" method="post">
				<input type="text" class="text" />
				<input type="password" >
				<div class="submit"><input type="submit" onClick="myFunction()" value="Sign in" ></div>
				<div class="clear"></div>
				<div class="new">
					<h3><a href="#">Forgot password ?</a></h3>
					<h4><a href="#">New here ? Sign Up</a></h4>
					<div class="clear"></div>
				</div>
				<div class="copy-right">
				<a href="<%=basePath %>user/login" target="_blank">xixi丫丫</a>
				</div>
			</form>
		</div>
</body>
</html>
