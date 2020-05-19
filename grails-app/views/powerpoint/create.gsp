<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/19/2020
  Time: 1:16 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">



</head>

<body>

<div class="w3-container" style="width: 80%; margin: auto;">

    <g:form action="save">

        <label>Presentation Name</label>
        <g:textField name="slidename" class="w3-input w3-border"></g:textField>

        <g:hiddenField name="slidesnum" value="${num}"></g:hiddenField>

        <br>
        <br>
        <br>


        <g:each in="${1..num}" var="i">

            <label>Title</label>
        <g:textField name="title[${i}]" class="w3-input  w3-border"></g:textField>

            <label>Content</label>
        <g:textArea name="content[${i}]" class="w3-input  w3-border" rows="8"></g:textArea>

            <hr>

        <br>

    </g:each>

        <g:submitButton name="submit" value="Submit" class="w3-btn w3-blue-grey"></g:submitButton>
    </g:form>


</div>

</body>
</html>