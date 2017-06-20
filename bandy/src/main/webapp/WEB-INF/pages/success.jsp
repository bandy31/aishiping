<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>爱视屏</title>
<style type="text/css">
    body{
         background-image: url("<%=basePath%>/images/background.jpg");
         background-repeat:no-repeat;
    }
    .main{ background-color: white; width:200px; height: 200px;float: left; margin-left: 50px}
</style>
</head>
<body>
          <div class="main"><video src="<%=basePath %>video/daddy.mp4" controls="controls" width="200px" height="200px">
您的浏览器不支持 video 标签。
</video></div>
          <div class="main">1</div>
          <div class="main">1</div>
          <div class="main">1</div>
</body>
</html>