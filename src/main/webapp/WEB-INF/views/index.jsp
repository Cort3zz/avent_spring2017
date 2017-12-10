<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
    <!-- Custom Theme files -->
    <meta charset="UTF-8">
    <link href="/resources/css/indexStyle.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- Custom Theme files -->

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords"
          content="Square login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design"/>
    <!--Google Fonts-->
    <link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
          rel='stylesheet' type='text/css'>
    <!--Google Fonts-->
</head>
<body>
<!--header start here-->
<div class="login-form">
    <div class="box">
        <a class="button" href="downloadApp.jsp"><img src="${pageContext.request.contextPath}/resources/img/downloadPic.png" height="40" width="120"></a>
    </div>
    <div class="top-login">
        <span><img src="/resources/img/group.png" alt=""/></span>
    </div>
    <div class="login-top">
        <form:form action="/advent" method="post" modelAttribute="loginPassword">
            <div class="textToBlour">
                <p align="center" class="error">Hány hónapja vagyunk együtt? (Választ számban add meg!)
                  </p>
                <br>
                <p align="center" class="errormessage">
                    <form:errors path="password"/>
                </p>
            </div>
            <div class="login-ic">
                <i class="log"></i>
                <form:input   path="password" type="text" name="user" value="Válasz" onfocus="this.value = '';"
                              onblur="if (this.value == '') {this.value = 'Válasz';}"/>
                <div class="clear"></div>
            </div>
            <div class="log-bwn">
                <input type="submit" value="Login"/>
            </div>
        </form:form>
    </div>
</div>
<!--header start here-->
</body>
</html>