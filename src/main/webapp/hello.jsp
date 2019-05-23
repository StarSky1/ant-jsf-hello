<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<html>
<head>
    <title>Hello Application</title>
</head>
<body>
<f:view>
    <h:form id="helloForm">
        <h3>Please enter your name </h3>
        <table>
            <tr>
                <td>Name:</td>
                <td>
                    <h:inputText id="username" value="#{hello.userName}" required="true"/>
                    <h:message for="username"/>
                </td>
            </tr>
        </table>
        <p>
            <h:commandButton id="helloCommand" type="submit" value="Submit" action="#{hello.sayHelloAction}"/>
        </p>
    </h:form>
    <h:messages globalOnly="true"/>
</f:view>
</body>
</html>