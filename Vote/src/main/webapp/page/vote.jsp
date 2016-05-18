<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>参与投票</title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
</head>
<body>



	<div id="header" class="wrap">
		<img src="../images/logo.gif" />
	</div>
	<div id="navbar" class="wrap">
		<div class="profile">
			您好,${ sessionScope.loginUser.vuusername} 
			<span class="return"><a href="vote_list.action">返回列表</a></span>
			<span class="addnew"><a href="add.jsp">添加新投票</a></span> <span
				class="modify"><a href="Subject!modify.action">维护</a></span>

		</div>
		<div class="search">
			<form method="post" action="Subject!search.action">
				<input type="text" name="keywords" class="input-text" value="" /><input
					type="submit" name="submit" class="input-button" value="" />
			</form>
		</div>
	</div>

	<div id="vote" class="wrap">
		<h2>参与投票</h2>
		<ul class="list">
			<li>
				<h4>${sessionScope.voteBean.vstitle }</h4>
				<p class="info">共有 ${sessionScope.voteBean.optionCount } 个选项，已有${sessionScope.voteBean.voteUserCount } 个网友参与了投票。</p>
				<label style="color:red;">&nbsp;${sessionScope.saveMsg}</label>
				<c:remove var="saveMsg" scope="session"/>
				<form method="post" action="vote_save.action">
					<input type="hidden" name="vsId" value="${sessionScope.voteBean.vsId }" />
					<input type="hidden" name="vuId" value="${sessionScope.loginUser.vuid }" />
					<ol>
						<c:set var="sType" value="${ sessionScope.voteBean.vs_type eq 1 ? 'radio':'checkbox'}" />
						<c:forEach items="${sessionScope.voteBean.options }" var="item">
							<li><input type="${sType}" name="voId" value="${item.voId }" />${item.vooption }</li>
						</c:forEach>
					</ol>
					<p class="voteView">
						<input type="image" src="../images/button_vote.gif" />
						<a href="vote_view.action?vsId=${sessionScope.voteBean.vsId }"><img src="../images/button_view.gif" /></a>
					</p>
				</form>
			</li>
		</ul>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>
