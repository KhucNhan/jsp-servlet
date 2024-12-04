<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form method="post" action="calculator">
        <input type="number" name="number1">
        <br>
        <select name="type">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <br>
        <input type="number" name="number2">
        <br>
        <button type="submit">Calculator</button>
        <br>
        <strong>${result}</strong>
    </form>
</body>
</html>
