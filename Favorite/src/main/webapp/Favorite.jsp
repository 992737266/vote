<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html lang="en-US">
<head>

<title>搜藏</title>
<meta http-equiv="pragma" content="no-casche">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="css/styles.css">


</head>
<body>
	<form name="favForm" method="post" action="">


		<div class="banner" valign="top">搜藏</div>

		<table cellspacing="0" cellpadding="0" border="0">
			<tr>
				<td style="text-align: right;" valign="top">
					<!-- 左边Tag列表 -->
					<div class="left_labels">


						<table class="labels_table" cellspacing="0" cellpadding="0"
							border="0">
							<tr>
								<td><a href="add.jsp" onclick="add();" style="font-weight: bold;">添加书签</a></td>
							</tr>
							<tr>
								<td class="selected_label"><a
									href="Tag_getAll.action">全部</a></td>
							</tr>
							<tr>
								<td><a href="select?type=''">未分类</a></td>
							</tr>
							
							<c:forEach items="${tag}" var="item"> 
		
								<tr>
									<td><a href="select?type=${item.t_name }">${item.t_name}</a></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</td>
				<td>
					<!-- 右边fav内容 -->
					<div class="content_links">

						<div style="padding: 6px 10px;">

							<c:forEach items="${favorite}" var="item">
							
								<div>
									<a href="${item.f_url}"style="color: blue; font-size: 18px;" target="_blank">${item.f_label}</a>
								</div>
								<div style="color: black; font-size: 16px;">${item.f_desc }</div>
								<div style="color: green; font-size: 14px;">
									${item.f_url}
								</div>
								<br/>
							</c:forEach>

						</div>
					</div>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>