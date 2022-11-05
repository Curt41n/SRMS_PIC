<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title> 静态资源后台管理系统</title>
    <link rel="stylesheet" href="css/public.css" />
    <link rel="stylesheet" href="css/style.css" />
    <style>
        .privilege input{
            width: 20px;
            height: 20px;
            vertical-align: middle;
            /* margin-right: 30px; */
        }
        .privilege{
            line-height: 20px;
        }
    </style>
</head>

<body>
    <!--头部-->
    <header class="publicHeader">
        <h1> 静态资源后台管理系统</h1>

        <div class="publicHeaderR">
            <div style="width: 46px;height: 46px;border-radius: 50%;overflow: hidden;margin-left: -100px;float: left">
                <img style="width: 100%" src="img/head_img.jpeg" alt="头像">
            </div>
            <span style="float: left"><a href="login.html">退出</a></span>
        </div>
    </header>
    <!--时间-->
    <section class="publicTime">
        <span id="time">2019年1月1日 11:11 星期一</span>
        <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
    </section>
    <!--主体内容-->
    <section class="publicMian ">
        <div class="left"></div>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>角色管理页面 >> 角色修改页面</span>
            </div>
            <div class="providerAdd">
                <form action="${pageContext.request.contextPath}/roleUpdate" method="GET" >
                    <!--div的class 为error是验证错误，ok是验证成功-->
                    <div>
                        <label for="rolename">角色名称：</label>
                        <input type="text" name="rolename" id="rolename" value="${role.rname}"/>
                        <span>*请输入角色名称</span>
                    </div>
                    <div>
                        <label for="roledec">角色描述：</label>
                        <input type="text" name="roledec" id="roledec" value="${role.rdesc}"/>
                        <span>*请输入角色描述</span>
                    </div>
                    <div>
                        <label>角色权限：</label>
                        <c:if test="${role.rid == 1}">
                            <input type="radio" name="rid" value="1" checked>1级
                            <input type="radio" name="rid" value="2">2级
                            <input type="radio" name="rid" value="3">3级
                        </c:if>
                        <c:if test="${role.rid ==2}">
                            <input type="radio" name="rid" value="1" >1级
                            <input type="radio" name="rid" value="2" checked>2级
                            <input type="radio" name="rid" value="3" >3级
                        </c:if>
                        <c:if test="${role.rid ==3}">
                            <input type="radio" name="rid" value="1" >1级
                            <input type="radio" name="rid" value="2">2级
                            <input type="radio" name="rid" value="3" checked>3级
                        </c:if>
                        <span>*请选择角色权限</span>
                    </div>

                    <div class="providerAddBtn">
                        <!--<a href="#">保存</a>-->
                        <!--<a href="userList.html">返回</a>-->
                        <input type="submit" value="保存" onclick="history.back(-1)" />
                        <input type="button" value="返回" onclick="history.back(-1)" />
                    </div>
                </form>
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
        });
    </script>
</body>

</html>