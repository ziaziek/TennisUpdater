<%-- 
    Document   : index
    Created on : 2013-12-12, 18:58:21
    Author     : Przemo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>Test</h2>
        <%System.out.println("Number of rows: "); %>
        <% System.out.println(new data.DatabaseInfo().getNumberOfRows()); %>
    </body>
</html>
