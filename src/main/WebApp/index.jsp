<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Professional Calculator</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div class="calculator-container">
            <h1>Professional Calculator</h1>
            <form action="calculate" method="post">
                <div class="display">
                    <input type="text" name="num1" id="num1" placeholder="Enter first number" required>
                    <input type="text" name="num2" id="num2" placeholder="Enter second number" required>
                </div>
                <div class="buttons">
                    <button type="submit" name="operation" value="add">+</button>
                    <button type="submit" name="operation" value="subtract">−</button>
                    <button type="submit" name="operation" value="multiply">×</button>
                    <button type="submit" name="operation" value="divide">÷</button>
                </div>
            </form>
        </div>
    </body>
</html>
