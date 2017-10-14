<%--
  Created by IntelliJ IDEA.
  User: Ati
  Date: 2017. 10. 15.
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<body>
    <form:form commandName="goal">
        <table>
            <tr>
                <td>Enter minutes</td>
                <!--ez annyit tenne ki hogy a goal osztályon belül van egy minutes tagváltozo--->
                <td><form:input path="minutes"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Enter Goal minutes"/>
                </td>


            </tr>

        </table>
    </form:form>
</body>
</html>
