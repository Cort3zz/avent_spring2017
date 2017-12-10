<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Napi Kód</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shadow Login Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="/resources/css/messageLoginStyle.css" rel="stylesheet" type="text/css"/>
<!-- //Custom Theme files --> 
<!-- web font --> 
<link href="//fonts.googleapis.com/css?family=Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Arsenal:400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-agileinfo slider ">
		<div class="items-group">
			<div class="item agileits-w3layouts">

				<div class="block text main-agileits">


					<span class="circleLight"></span>
					<!-- login form -->
					<div class="back"><img src="/resources/img/advent.png"></div>
					<div class="login-form loginw3-agile">

						<div class="agile-row">
							<h1>Írd be a napi kódot!</h1>
							<div class="login-agileits-top">
								<form:form action="/message" method="post" modelAttribute="messagePassword">
                                    <h1>  <form:errors cssClass="" path="password"/></h1>
									<form:input   path="password" type="text" class="name" name="dailypass"/>
									<input type="submit" value="Elküld">
								</form:form>
							</div>

							<div class="login-agileits-bottom wthree"> 
								<h6><a href="/advent.jsp">Vissza a naptárhoz</a></h6>
							</div> 
						</div>  
					</div>   
				</div>

				<div class="w3lsfooteragileits">
					<p class="hide"> &copy; 2017 Shadow Login Form. All Rights Reserved | Design by <a href="http://w3layouts.com" target="=_blank">W3layouts</a></p>
				</div> 
			</div>   
		</div>
	</div>	 
	<!-- //main --> 
</body>
</html>