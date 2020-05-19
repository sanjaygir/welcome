<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/19/2020
  Time: 1:14 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>

<body>


<div class="w3-container w3-margin-left w3-margin-right">
    <h3 class="w3-center">Quick Powerpoint Slide Creator!</h3>

    <p class="w3-center">Creator: Sanjay Giri</p>

    <h5 class="w3-center">How many slides do you need?</h5>

        <g:form action="create" class="w3-row-padding" style="width: 50%; margin: auto;">

            <div class="w3-twothird">
            <g:textField name="numSlides" class="w3-input"></g:textField>
            </div>

            <div class="w3-third">
            <g:submitButton name="Submit" value="Submit" class="w3-btn w3-blue-grey"></g:submitButton>
            </div>
        </g:form>

</div>


</body>
</html>