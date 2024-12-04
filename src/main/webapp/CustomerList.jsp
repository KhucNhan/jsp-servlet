<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách khách hàng</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>Ten</td>
        <td>Ngay Sinh</td>
        <td>Dia Chi</td>
        <td>Anh</td>
    </tr>
    <c:forEach items="${listC}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.date}</td>
            <td>${user.address}</td>
            <td>${user.image}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
