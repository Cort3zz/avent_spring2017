
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- All the files that are required -->
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<link href='http://fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<link rel="stylesheet" href="/resources/css/adminLoginStyle.css">
<script src="/resources/js/adminLogin.js"></script>

<!-- Where all the magic happens -->
<!-- LOGIN FORM -->
<div class="text-center" style="padding:50px 0">
    <div class="logo">login</div>
    <!-- Main Form -->
    <div class="login-form-1">
        <form id="login-form" class="text-left" method="post">
            <div class="login-form-main-message"></div>
            <div class="main-login-form">
                <div class="login-group">
                    <div class="form-group">
                        <label for="lg_username" class="sr-only">Username</label>
                        <input type="text" class="form-control" id="lg_username" name="lg_username" placeholder="username">
                    </div>
                    <div class="form-group">
                        <label for="lg_password" class="sr-only">Password</label>
                        <input type="password" class="form-control" id="lg_password" name="lg_password" placeholder="password">
                    </div>
                </div>
                <button type="submit" class="login-button"><i class="fa fa-chevron-right"></i></button>
            </div>

    <!-- end:Main Form -->
</div>