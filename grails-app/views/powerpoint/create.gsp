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
</head>

<body>




    <g:form action="save">


        <g:textField name="slidename"></g:textField>

        <g:hiddenField name="slidesnum" value="${num}"></g:hiddenField>

        <br>
        <br>
        <br>


        <g:each in="${1..num}" var="i">

        <g:textField name="title[${i}]"></g:textField>

        <g:textArea name="content[${i}]"></g:textArea>

        <br>

    </g:each>


        <g:submitButton name="submit" value="Submit"></g:submitButton>
    </g:form>

</body>
</html>