<%@ page import="cn.wolfcode.entity.T_Picture" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    T_Picture pic = (T_Picture) session.getAttribute("picInfo");
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title> 静态资源后台管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1> 静态资源后台管理系统</h1>
    <div class="publicHeaderR">
        <div style="width: 46px;height: 46px;border-radius: 50%;overflow: hidden;margin-left: -100px;float: left">
            <img style="width: 100%" src="img/head_img.jpeg" alt="头像">
        </div>
        <span style="float: left" ><a href="login.jsp">退出</a></span>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2019年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left"></div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>图片管理页面 >> 图片详情</span>
        </div>
        <div class="providerView">

                <div class="providerViewLeftbox">
                    <p><strong>图片编号：</strong><span>${picInfo.pic_code}</span></p>
                    <p><strong>文件名称：</strong><span>${picInfo.pic_name}</span></p>
                    <p><strong>文件大小：</strong><span>0.7MB</span></p>
                    <p><strong>文件类型：</strong><span>${picInfo.pic_type}</span></p>
                    <p><strong>审核状态：</strong><span>${picInfo.pic_check}</span></p>
                    <p><strong>上传时间：</strong><span>${picInfo.pic_time}</span></p>
                    <p><strong>浏览数量：</strong><span>1</span></p>
                </div>
            <div class="providerViewRightbox">
                <a href="pro?checkId=1">审核通过</a>
                <a href="pro?checkId=2" >审核未通过</a>
                <a href="picture.jsp">返回</a>
                <div style="border: #bd644e solid ;width: 300px;height: 300px;margin-top: 20px;">
                    <%
                        String path = request.getContextPath();
                        out.println(path);
                        String basePath = request.getScheme() + "://"
                                + request.getServerName() + ":" + request.getServerPort()
                                + path + "/";
                        out.println(basePath);
                    %>
                    <img alt="" src="<%=basePath%>${picInfo.getPic_url()}" style="width:100%;height:auto">
                </div>

            </div>

        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>
<script src="js/jquery.js"></script>
<script>
    $(function () {
        $(".left").load("common_pri.jsp");
    }) ;
</script>
</body>
</html>