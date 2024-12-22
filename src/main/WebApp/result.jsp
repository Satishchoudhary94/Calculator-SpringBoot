<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Result</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div class="calculator-container">
            <h1>Calculation Result</h1>
            <p class="result"><%= session.getAttribute("result") != null ? session.getAttribute("result") : "No result available" %></p>
            <a href="/" class="back-btn">Go Back</a>
        </div>
    </body>
</html>
