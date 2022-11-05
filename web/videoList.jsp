<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="cn.wolfcode.entity.T_User" %>
<%@ page import="cn.wolfcode.entity.T_priviage" %>
<%@ page import="java.util.List" %>
<%@ page import="cn.wolfcode.entity.T_video" %>
<%
    T_video videoInfo =(T_video)session.getAttribute("videoInfo");
    List<T_video> videoAllInfo = (List<T_video>)session.getAttribute("videoAllInfo");
    //获取session中的用户
//    T_User userInfo = (T_User)session.getAttribute("userInfo");
//    //获取用户的权限
//    List<T_priviage> priList = userInfo.getPriList();
//
//    //判定用户权限中是否包含用户管理模块权限
//    for(T_priviage pri:priList){
//        if(pri.getPname().equals("视频管理")){
//            //获取这个模块权限对应的按钮级的权限
//            List<T_priviage> son = pri.getPriList();
//            for(T_priviage sonPri:son){
//                //判定是否存在该按钮级别权限
//                if(sonPri.getPname().equals("视频管理_查询")){
//                    pageContext.setAttribute("video_select",true);
//                    pageContext.setAttribute("video_select_url",sonPri.getPurl());
//                }
//                if(sonPri.getPname().equals("视频管理_编辑")){
//                    //设置
//                    pageContext.setAttribute("video_edit",true);
//                }
//                if(sonPri.getPname().equals("视频管理_新增")){
//                    //设置
//                    pageContext.setAttribute("video_add",true);
//                }
//                if(sonPri.getPname().equals("视频管理_详情")){
//                    //设置
//                    pageContext.setAttribute("video_details",true);
//                }
//                if(sonPri.getPname().equals("视频管理_删除")){
//                    //设置
//                    pageContext.setAttribute("video_delete",true);
//                }
//            }
//            //结束
//            continue ;
//        }
//    }
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title> 静态资源后台管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery.js"></script>
    <!--<script src="js/js.js"></script>-->
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
            <span>视频管理页面</span>
        </div>
        <div class="search">
            <span>关键字：</span>
            <span style="color: cornflowerblue">${select_msg}</span>
            <form method="post" action="videoSearch">
                <input type="text" name="vid" placeholder="请输入搜索关键字"/>

<%--                <span>类型:</span>--%>
<%--                <select name="tigong" >--%>
<%--                    <option value="">--请选择--</option>--%>
<%--                    <option value="">欧美</option>--%>
<%--                    <option value="">日韩</option>--%>
<%--                    <option value="">国产</option>--%>
<%--                </select>--%>

<%--                <span>状态：</span>--%>
<%--                <select name="shenhe">--%>
<%--                    <option value="">--请选择--</option>--%>
<%--                    <option value="">审核通过</option>--%>
<%--                    <option value="">审核未通过</option>--%>
<%--                    <option value="">未审核</option>--%>
<%--                </select>--%>
<%--                <c:if test="${video_select}">--%>
                <input type="submit" value="查询"/>
            </form>
<%--                </c:if>--%>
<%--                <c:if test="${video_add}">--%>
            <a href="videoadd.jsp">新增视频</a>
<%--                </c:if>--%>
        </div>
        <span>${delete_msg}</span>
        <div>
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">视频编号</th>
                    <th width="10%">文件名称</th>
                    <th width="10%">文件大小</th>
                    <th width="10%">文件类型</th>
                    <th width="10%">视频分类</th>
                    <th width="10%">审核状态</th>
                    <th width="10%">上传时间</th>
                    <th width="10%">浏览数量</th>
                    <th width="20%">操作</th>
                </tr>

                <c:if test="${not empty videoInfo}">
                    <tr>
                        <td>${videoInfo.vid}</td>
                        <td>${videoInfo.vname}</td>
                        <td>${videoInfo.vsize}</td>
                        <td>${videoInfo.vtype}</td>
                        <td>${videoInfo.vcate}</td>
                        <td>${videoInfo.vstate}</td>
                        <td>${videoInfo.uploadtime}</td>
                        <td>${videoInfo.pv}</td>
                        <td>
                            <a href="videoView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                            <a href="videoUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                            <a href="#" class="delete"><img src="img/schu.png" alt="删除" title="删除"/></a>
                        </td>
                    </tr>
                </c:if>
            </table>
        </div>
        <div>
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">视频编号</th>
                    <th width="10%">文件名称</th>
                    <th width="10%">文件大小</th>
                    <th width="10%">文件类型</th>
                    <th width="10%">视频分类</th>
                    <th width="10%">审核状态</th>
                    <th width="10%">上传时间</th>
                    <th width="10%">浏览数量</th>
                    <th width="20%">操作</th>
                </tr>
                <tr>
                    <td>XXXXXXXXXXXXXXX</td>
                    <td>逍遥见灵儿</td>
                    <td>10.5MB</td>
                    <td>.mp4</td>
                    <td>国漫</td>
                    <td>审核通过</td>
                    <td>2019/11/12</td>
                    <td>9999</td>
                    <td>
                        <a href="videoView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="videoUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="#" class="delete"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>

                <c:forEach items="${videoAllInfo}" var="ivideo">
                    <td>${ivideo.vid}</td>
                    <td>${ivideo.vname}</td>
                    <td>${ivideo.vsize}</td>
                    <td>${ivideo.vtype}</td>
                    <td>${ivideo.vcate}</td>
                    <td>${ivideo.vstate}</td>
                    <td>${ivideo.uploadtime}</td>
                    <td>${ivideo.pv}</td>
                </c:forEach>
            </table>
        </div>
    </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeBi">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该视频吗？</p>
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
        console.log(123)
        $(".left").load("common_pri.jsp");
    }) ;
</script>
</body>
</html>