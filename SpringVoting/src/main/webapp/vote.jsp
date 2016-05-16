<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>参与投票</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>


 
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		您好，${sessionScope.CurrentUser.userName }
		<span class="return"><a href="Subject_list.action">返回列表</a></span>
		<span class="addnew"><a href="Subject_read.action">添加新投票</a></span>
		<span class="modify"><a href="Subject_modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>参与投票</h2>
	<ul class="list">
		<li>
			<h4>${sessionScope.vote.vsTitle }</h4>
			<p class="info">共有 ${sessionScope.vote.optionCount }个选项，已有${vote.voteUserCount} 个网友参与了投票。</p>
			<form method="post" action="Vote_save.action">
			    <input type="hidden" name="vsId" value="${vote.vsId }"/> 
			    <input type="hidden" name="vuId" value="${loginUser.vuid }"/> 
				<ol>
					<c:set var="sType" value="${vote.VS_TYPE eq 1 ? 'radio':'checkbox'}"/>
				   	<c:forEach var="opt" items="${vote.options }" >
						<li><input type="${sType}" name="voId"  value="${opt.voId }"/>${opt.vooption }</li>				   		
				   		
				   	</c:forEach>
				</ol>
				<p class="voteView"><input type="image" src="images/button_vote.gif" /><a href="Vote_view.action?Id=${sessionScope.VoteSub.sid}"><img src="images/button_view.gif" /></a></p>
			</form>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
    