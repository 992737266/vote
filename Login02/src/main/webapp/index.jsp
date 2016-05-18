<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<form action="User_login.action" method="post" style="text-align:center; margin:80px auto; width:360px;">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input name="uname"></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="upass"></td>
			</tr>
			<tr>
				<td colspan="1"></td>
				<td><input type="submit" value="登陆"></td>
			</tr>
		</table>
	</form>
</body>
</html>
