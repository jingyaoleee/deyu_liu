<%--
  Created by IntelliJ IDEA.
  User: nsu
  Date: 2022/11/3
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>
    <div>
        <form action="/loginServlet" method="get">
            <h1>欢迎登录</h1>
            <table>
                <tr>
                    <td>账号：</td>
                    <td><input type="text" name="account"/></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <%--<tr>--%>
                    <%--<td>性别：</td>--%>
                    <%--<td>--%>
                        <%--<input type="radio" name="sex" value="M"/>男--%>
                        <%--<input type="radio" name="sex" value="F"/>女--%>
                    <%--</td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td>分类：</td>--%>
                    <%--<td>--%>
                        <%--<input type="checkbox" name="type" value="1"/>绿色蔬菜--%>
                        <%--<input type="checkbox" name="type" value="2"/>有机蔬菜--%>
                        <%--<input type="checkbox" name="type" value="3"/>禽类--%>
                    <%--</td>--%>
                <%--</tr>--%>
                <tr colspan="2">
                    <td>
                        <input type="submit" value="登录"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
