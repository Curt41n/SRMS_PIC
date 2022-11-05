//package cn.wolfcode.controller;
//
//import cn.wolfcode.entity.T_video;
//import cn.wolfcode.service.VideoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletRequest;
//import java.sql.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//public class VideoController {
//    @Autowired
//    VideoService videoServiceImpl;
//
//    @RequestMapping("/videoSearch")
//    public ModelAndView videoSearch(@RequestParam(name = "vid",required = true)String Id,HttpServletRequest req){
//        req.getSession().removeAttribute("videoInfo");
//
//        T_video video =videoServiceImpl.getVideoByCondition(Id);
//        ModelAndView mav =new ModelAndView();
//        if (video == null) {
//            mav.setViewName("videoList.jsp");
//            mav.addObject("select_msg","您输入了错误或者不存在的视频编号");
//            return mav;
//        }
//
//        req.getSession().setAttribute("videoInfo",video);
//
//        mav.setViewName("videoList.jsp");
//        mav.addObject("select_msg","查询成功");
//
//        return mav;
//    }
//
//    @RequestMapping("/videoUpdate")
//    public ModelAndView videoupdate(@RequestParam(name = "videoId",required = true)String vid,
//                                    @RequestParam(name = "fileName",required = true)String vname,
//                                    @RequestParam(name = "videoSize",required = true)String vsize,
//                                    @RequestParam(name = "videoType",required = true)String vtype,
//                                    @RequestParam(name = "status",required = true)String vstate,
//                                    @RequestParam(name = "uploadTime",required = true)Date uploadtime,
//                                    @RequestParam(name = "pvcount",required = true)Integer pv,
//                                    HttpServletRequest req){
//        Map<String,Object> map =new HashMap<>();
//        map.put("vid",vid);
//        map.put("vname",vname);
//        map.put("vsize",vsize);
//        map.put("vtype",vtype);
//        map.put("vstate",vstate);
//        map.put("uploadtime",uploadtime);
//        map.put("pv",pv);
//
//        T_video video = (T_video) req.getAttribute("videoInfo");
//        ModelAndView mav= new ModelAndView();
//        int n =videoServiceImpl.vUpdate(map);
//
//        List<T_video> videoList=(List<T_video>)videoServiceImpl.getAllVideo();
//        req.getSession().setAttribute("videoAllInfo",videoList);
//        mav.setViewName("videoUpdate.jsp");
//        mav.addObject("update_msg","修改成功");
//
//        return mav;
//    }
//
//    @RequestMapping("/videoadd")
//    public ModelAndView videoadd(@RequestParam(name = "vid",required = true)String vid,
//                                 @RequestParam(name = "vname",required = true)String vname,
//                                 @RequestParam(name = "vcate",required = true)String vcate,
//                                 HttpServletRequest req){
//        Map<String,Object> map = new HashMap<>();
//        map.put("vid",vid);
//        map.put("vname",vname);
//        map.put("vcate",vcate);
//        ModelAndView mav = new ModelAndView();
//        int n = videoServiceImpl.vAdd(map);
//
//        List<T_video> videoList = (List<T_video>) videoServiceImpl.getAllVideo();
//        mav.setViewName("videoadd.jsp");
//        mav.addObject("add_msg","添加成功");
//
//        return mav;
//    }
//
//    @RequestMapping("/delete")
//    public ModelAndView delete(HttpServletRequest req){
//        ModelAndView mav = new ModelAndView();
//
//        T_video video = (T_video) req.getSession().getAttribute("videoInfo");
//        int n = videoServiceImpl.vDelete(video.getVid());
//        List<T_video> videoList = (List<T_video>) videoServiceImpl.getAllVideo();
//        req.getSession().setAttribute("videoAllInfo",videoList);
//        req.getSession().removeAttribute("videoInfo");
//        mav.setViewName("videoList.jsp");
//        mav.addObject("delete_msg","删除成功");
//        return mav;
//    }
//}
