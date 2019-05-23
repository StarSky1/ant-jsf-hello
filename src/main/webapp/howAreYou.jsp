<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<html>
<f:view>
    <head>
        <title>A Simple JavaServer Faces Application</title>
    </head>
    <body>
        <h3>
            How are you,
            <h:outputText value="#{hello.userName}"/>
        </h3>
    </body>
</f:view>
</html>