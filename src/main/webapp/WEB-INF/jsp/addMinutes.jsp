<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes Page</title>
    <script type="text/javascript" src="jquery-3.2.1.js">

    </script>

    <script type="text/javascript">
        $(document).ready(function () {
            $.getJSON('<spring:url value="activities.json"/>',{
                ajax: 'true'
            }, function (data) {
                var html= '<option value="">--Please select one--</option>';
                var len=data.length;
                for(var i = 0; i<len; i++){
                    html+='<option value="'+data[i].desc+'">'
                        +data[i].desc+'</option>';
                }
                html+='</option>';
                $('#activities').html(html);
            });
        });
    </script>
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
    <h1>Add minutes exercise</h1>
    Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a> | <a href="?language=hu">Hungarian</a>
    <!--ez a form össze van kötve a model osztályal a exercise-on keresztül-->
    <form:form commandName="exercise">
        <form:errors path="*" cssClass="errorblock" element="div"></form:errors>
        <table>
            <tr>
                <td><spring:message code="goal.text"/> </td>
                <td><form:input path="minutes"/></td>
                <td>
                    <form:select id="activities" path="activity"></form:select>
                </td>
                <td><form:errors path="minutes" cssClass="error"/></td>
            </tr>
            <tr>
                <td colspan="4">
                    <input type="submit" value="Enter Exercise"/>
                </td>
            </tr>
        </table>
    </form:form>
<h1>${goal.minutes}</h1>
</body>
</html>
