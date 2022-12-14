<%@ page import="cn.wolfcode.entity.T_Role" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" deferredSyntaxAllowedAsLiteral="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<T_Role> t_roles = (List<T_Role>) session.getAttribute("roles");
    pageContext.setAttribute("roles",t_roles);



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
        <span style="float: left" ><a href="login.html">退出</a></span>
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
                <span>角色管理页面</span>
            </div>

            <div class="search">
                <form action="/select" method="post">
                <span>查询条件：</span>
                <input type="text" name="rolename" placeholder="请输入关键字"/>
                <input type="submit"  value="查询"/>
                </form>
                <a href="roleAdd.jsp">新增角色</a>
            </div>

            <!--角色-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="15%">角色名称</th>
                    <th width="15%">权限</th>
                    <th width="15%">描述</th>
                    <th width="15%">操作</th>
                </tr>

                    <c:forEach items="${roles}" var="role">
                <tr>
                    <td>${role.rname}</td>
                    <td>${role.rid}级权限</td>
                    <td>${role.rdesc}</td>

                    <td>
                        <a href="userView.html"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="/loadupdate?rname=${role.rname}"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="/delete?rname=${role.rname}" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                    </c:forEach>
                </tr>

                
            </table>
        </div>
    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该角色吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

    <footer class="footer">
    </footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>
<script>
    $(function () {
        $(".left").load("common_pri.jsp");
    }) ;
</script>
</body>
</html>