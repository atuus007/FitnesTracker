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
    <style>
        .error{
            color: #ff0000;
        }
        .errorblock{
            color:#000;
            background-color: aqua;
            border: 3px solid #ff0000;
            margin: 16px;
        }
    </style>
</head>
<body>
    <form:form commandName="goal">
        <!-- A * azt jelenti hogy minden hibát kapjon el ami keletkezik-->
        <!-- És megadom neki azt a css stilust amit csináltam-->
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td>Enter minutes</td>
                <!--ez annyit tenne ki hogy a goal osztályon belül van egy minutes tagváltozo--->
                <td><form:input path="minutes" cssErrorClass="errorblock" /></td>
                <td><form:errors path="minutes" cssClass="error"/></td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Enter Goal minutes"/>
                </td>


            </tr>

        </table>
    </form:form>
</body>
</html>
