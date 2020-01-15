<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-1-14
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width: 100%">
    <table>
        <tr>
            <td><span>openid=${wxMpUser.openId}</span></td>
            <td><span>昵称为:${wxMpUser.nickname}</span></td>
            <td><span>性别为:${wxMpUser.sexDesc}</span></td>
        </tr>
        <tr>
            <td><span>省为:${wxMpUser.province}</span></td>
            <td><span>市为:${wxMpUser.city}</span></td>
            <td><span>头像地址为:${wxMpUser.headImgUrl}</span></td>
        </tr>
    </table>
</div>
</body>
</html>
