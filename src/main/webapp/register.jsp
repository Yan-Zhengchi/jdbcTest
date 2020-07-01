<%--
  Created by IntelliJ IDEA.
  User: 30256
  Date: 2020/7/1
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="RegisterServlet.do" method="post">
    loginName:<input type="text" name="loginName"><br>
    userName:<input type="text" name="userName"><br>
    password:<input type="password" name="password"><br>
    sex:<input type="text" name="sex" placeholder="男1女0"><br>
    identityCode:<input type="text" name="identityCode"><br>
    email:<input type="text" name="email"><br>
    mobile:<input type="text" name="mobile"><br>
    type:<input type="text" name="type"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
