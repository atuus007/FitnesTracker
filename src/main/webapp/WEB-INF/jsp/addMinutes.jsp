<%--
  Created by IntelliJ IDEA.
  User: Ati
  Date: 2017. 10. 14.
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes Page</title>
</head>
<body>
    <h1>Add minutes exercise</h1>
    Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
    <!--ez a form össze van kötve a model osztályal a exercise-on keresztül-->
    <form:form commandName="exercise">
        <table>
            <tr>
                <td><spring:message code="goal.text"/> </td>
                <td><form:input path="minutes"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Enter Exercise"/>
                </td>
            </tr>
        </table>
    </form:form>
<h1>${goal.minutes}</h1>
</body>
</html>
