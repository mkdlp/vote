<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>投票列表</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>


 
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		<c:choose>
			<c:when test="${loginUser.vuusername eq null }">
				<a href="login.jsp">登录</a>
			</c:when>
			<c:otherwise>您好，${loginUser.vuusername }</c:otherwise>
		</c:choose>
		
		<span class="return"><a href="Subject_list.action">返回列表</a></span>
		<span class="addnew"><a href="add.jsp">添加新投票</a></span>
		<span class="modify"><a href="Subject_modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>投票列表</h2>
	<ul class="list">
		<c:forEach var="sub" items="${sessionScope.AllSubject}">
			<li  class="odd" >
			<h4>				
				<a href="Vote_view.action?Id=${sub.vsid }">${sub.vstitle }</a>
			</h4>
			<div class="join"><a href="Vote_vote.action?Id=${sub.vsid }">我要参与</a></div>
			<p class="info">共有${sub.optionCount }个选项，已有${sub.voteUserCount }个网友参与了投票。</p>
		</li>
		</c:forEach>
	
		
	
		
	
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
    