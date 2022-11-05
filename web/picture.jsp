<%@ page import="cn.wolfcode.entity.T_Picture" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    T_Picture picInfo = (T_Picture) session.getAttribute("picInfo");
    List<T_Picture> picAllInfo = (List<T_Picture>) session.getAttribute("picAllInfo");
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
            <span>图片管理页面</span>
        </div>
        <div class="search">
            <span>搜索条件：</span>
            <span style="color: pink">${selectMsg}</span>
            <form action="picSearch" method="post">
                <input type="text" name="pic_code" placeholder="请输入关键字"/>
                <input type="submit" value="搜索" />
            </form>
            <a href="pictureAdd.jsp">添加图片</a>
        </div>
        <span>${deleteMsg}</span>
        <div style="padding-top: 100px;">
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">图片编号</th>
                    <th width="15%">图片名称</th>
                    <th width="10%">图片分类</th>
                    <th width="10%">审核状态</th>
                    <th width="10%">上传时间</th>
                    <th width="10%">作者</th>
                    <th width="30%">操作</th>
                </tr>


                <c:if test="${not empty picInfo}">
                    <tr>
                        <td>${picInfo.pic_code}</td>
                        <td>${picInfo.pic_name}</td>
                        <td>${picInfo.pic_type}</td>
                        <td>${picInfo.pic_check}</td>
                        <td>${picInfo.pic_time}</td>
                        <td>${picInfo.pic_user}</td>
                        <td>
                            <a href="pictureView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                            <a href="pictureUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                            <a href="#" class="removeProvider"><img src="img/schu.png" alt="删除" title="删除"/></a>
                        </td>
                    </tr>
                </c:if>

            </table>
        </div>
        <div><!--图片操作表格-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">图片编号</th>
                    <th width="15%">图片名称</th>
                    <th width="10%">图片分类</th>
                    <th width="10%">审核状态</th>
                    <th width="10%">上传时间</th>
                    <th width="10%">作者</th>
                    <th width="30%">操作</th>
                </tr>

<%--                <tr>--%>
<%--                    <td>pic_index_001</td>--%>
<%--                    <td>心之所向</td>--%>
<%--                    <td>动漫</td>--%>
<%--                    <td>审核通过</td>--%>
<%--                    <td>2020/1/1</td>--%>
<%--                    <td>殷桃小丸子</td>--%>
<%--                    <td>--%>
<%--                        <a href="pictureView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>--%>
<%--                        <a href="pictureUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>--%>
<%--                        <a href="#" class="removeProvider"><img src="img/schu.png" alt="删除" title="删除"/></a>--%>
<%--                    </td>--%>
<%--                </tr>--%>

                <c:forEach items="${picAllInfo}" var="ipic">
                    <tr>
                        <td>${ipic.pic_code}</td>
                        <td>${ipic.pic_name}</td>
                        <td>${ipic.pic_type}</td>
                        <td>${ipic.pic_check}</td>
                        <td>${ipic.pic_time}</td>
                        <td>${ipic.pic_user}</td>
                        <td>
                            <a href="pictureView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                            <a href="pictureUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                            <a href="#" class="removeProvider"><img src="img/schu.png" alt="删除" title="删除"/></a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <span>${checkMsg}</span>
    </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeProv">
   <div class="removerChid">
       <h2>提示</h2>
       <div class="removeMain" >
           <p>你确定要删除该图片资源吗？</p>
           <form action="delete" method="post">
               <input type="submit" id="yes" value="确定">
           </form>

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