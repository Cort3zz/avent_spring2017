<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/resources/css/giftStyle.css">
<html>
<head>
    <title>Ajándék</title>

</head>
<body>
<h1>Kattintsd az ajándékdobozra a napi meglepetésért!</h1>
<div class="box">
    <a class="button" href="#popup1"><img src="/resources/img/gifts/gift.png" height="400" width="400"></a>
</div>

<div id="popup1" class="overlay">
    <div class="popup">
        <h2 align="center">Napi cukiság</h2>
        <a class="close" href="#">&times;</a>
        <div class="content">
            <form:form modelAttribute="dailyMessage"> ${dailyMessage.message} </form:form>
        </div>
    </div>
</div>
</body>
</html>
