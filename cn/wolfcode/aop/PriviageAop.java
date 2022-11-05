//package cn.wolfcode.aop;
//
//import cn.wolfcode.entity.T_Log;
//import cn.wolfcode.entity.T_User;
//import cn.wolfcode.entity.T_priviage;
//import cn.wolfcode.service.LogService;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Timestamp;
//import java.util.List;
//
//@Component
//@Aspect
//public class PriviageAop {
//
//    //先定义一个方法-表示切点（多个连接点）
//    @Pointcut("execution(* cn.wolfcode.controller.*.*(..))")
//    public void pointCut(){}
//
//    @Before("pointCut()")
//    public void before() {
//        System.out.println("aop执行......");
//        //怎么记录？HttpServletRequest中
//        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
//        ServletRequestAttributes sra = (ServletRequestAttributes) requestAttributes;
//        HttpServletResponse response = sra.getResponse();
//        HttpServletRequest request = sra.getRequest();
//        String requestURI = request.getRequestURI();
//        if (!requestURI.endsWith("/login")) {
//            //判定当前用户是否已登陆
//            Object userInfo = request.getSession().getAttribute("userInfo");
//            //登陆拦截做了
//            if (userInfo == null) {
//                //直接跳转到登陆页面
//                System.out.println("未登陆的");
//                try {
//                    request.getRequestDispatcher("login.jsp").forward(request, response);
//                } catch (ServletException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } else {
//                //已经登陆-获取session中的用户信息
//                T_User user = (T_User) userInfo;
//                //从用户中获取权限
//                List<T_priviage> priList = user.getPriList();
//                //判定当前用户是否具备当前操作权限
//                for (T_priviage pri : priList) {
//                    //获取的模块级的权限
//                    for (T_priviage sonPri : pri.getPriList()) {
//                        //获取子集权限
//                        if (!requestURI.endsWith(sonPri.getPurl())) {
//                            //不包含权限--执行--跳转到空白页面提示//响应数据
//                            try {
//                                request.getRequestDispatcher("error.jsp").forward(request, response);
//                            } catch (ServletException e) {
//                                e.printStackTrace();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//
//    }
//
//
//}
