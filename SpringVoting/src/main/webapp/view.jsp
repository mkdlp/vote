<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>



	<div id="header" class="wrap">
		<img src="images/logo.gif" />
	</div>
	<div id="navbar" class="wrap">
		<div class="profile">
			您好，${sessionScope.CurrentUser.userName } <span class="return"><a
				href="Subject_list.action">返回列表</a></span> <span class="addnew"><a
				href="Subject_read.action">添加新投票</a></span> <span class="modify"><a
				href="Subject_modify.action">维护</a></span>

		</div>
		<div class="search">
			<form method="post" action="Subject!search.action">
				<input type="text" name="keywords" class="input-text" value="" /><input
					type="submit" name="submit" class="input-button" value="" />
			</form>
		</div>
	</div>

	<div id="vote" class="wrap">
		<h2>查看投票</h2>
		<ul class="list">
			<li>
				<h4>${opts.vsTitle}</h4>
				<p class="info">共有 ${opts.optionCount }个选项，已有${opts.voteUserCount}
					个网友参与了投票。</p>
				<ol>
					<c:forEach  items="${opts.voteOptionCount }" var="count">
						<li>
							<div class="rate">
								<div class="ratebg">
									<div class="percent" style='width:
								<c:choose>
									<c:when test="${opts.voteUserCount == 0 }">0</c:when>
									<c:otherwise><fmt:formatNumber value="${count / opts.voteUserCount }" type="percent" maxFractionDigits="2"/></c:otherwise>
								</c:choose>'>
									</div>
								</div>
								<p>${count}票<span>( <c:choose>
											<c:when test="${opts.voteUserCount == 0 }">0</c:when>
											<c:otherwise>  
												<fmt:formatNumber value="${count / opts.voteUserCount }" type="percent" maxFractionDigits="2" />
											</c:otherwise>
										</c:choose> )</span></p>
							</div>
						</li>
					</c:forEach>



				</ol>
				<div class="goback">
					<a href="Vote_list.action">返回投票列表</a>
				</div>
			</li>
		</ul>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>
