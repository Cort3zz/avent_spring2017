<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<head>
    <title>Edit Messages</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Vertical (basic) form</h2>
    <form:form action="/admin" method="post" modelAttribute="dailyMessage">
        <div class="form-group">
            <label>Day:</label>
            <form:input path="day" type="text" class="form-control" name="day"/>
            </div>
        <div class="form-group">
            <label>Message:</label>
            <form:input path="message" type="text" class="form-control" name="message"/>
           </div>
        <form:button type="submit" class="btn btn-default">Submit</form:button>
    </form:form>
</div>

</body>
</html>
