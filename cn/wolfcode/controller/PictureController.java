package cn.wolfcode.controller;


import cn.wolfcode.entity.T_Picture;
import cn.wolfcode.service.PictureService;
import cn.wolfcode.service.impl.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PictureController {

    @Autowired
    PictureService pictureServiceImpl;

//    @RequestMapping("/common_pri.jsp")
//    public void jumpPicture(HttpServletRequest req){
//        List<T_Picture> picList = (List<T_Picture>) pictureServiceImpl.getAllPic();
//        req.getSession().setAttribute("picAllInfo",picList);
//  }

    @RequestMapping("/picSearch")
    public ModelAndView picSearch(@RequestParam(name = "pic_code", required = true) String code, HttpServletRequest req){


//  }
        req.getSession().removeAttribute("picInfo");

        T_Picture pic = pictureServiceImpl.getPic(code);
//        List<T_Picture> picList = (List<T_Picture>) pictureServiceImpl.getAllPic();
        ModelAndView mav = new ModelAndView();
//        req.getSession().setAttribute("picAllInfo",picList);
        if (pic == null){
            mav.setViewName("picture.jsp");
            mav.addObject("selectMsg","您输入了错误或者不存在的照片编码");
            return mav;
        }

            req.getSession().setAttribute("picInfo", pic);

            mav.setViewName("picture.jsp");
            mav.addObject("selectMsg", "查询成功");

            return mav;
    }
//    @RequestMapping("/pictureView.jsp")
//    public ModelAndView picView(){
//        HttpServletRequest req
//    }
//    pic_code=#{pic_code}, pic_name=#{pic_name},
//    pic_user=#{pic_user},pic_phone=#{pic_phone} ,
//    pic_address=#{pic_address},pic_chuanzhen=#{pic_chuanzhen},
//    pic_content=#{pic_content} where pic_url=#{pic_url}

    @RequestMapping("/pictureUpdate")
    public ModelAndView picUpdate(@RequestParam(name = "providerId", required = true) String pic_code,
                                  @RequestParam(name = "providerName", required = true) String pic_name,
//                                  @RequestParam(name = "people", required = true) String pic_user,
//                                  @RequestParam(name = "phone", required = true) String pic_phone,
//                                  @RequestParam(name = "address", required = true) String pic_address,
//                                  @RequestParam(name = "fax", required = true) String pic_chuanzhen,
                                  @RequestParam(name = "describe", required = true) String pic_content,
                                  HttpServletRequest req){
        Map<String,Object> map = new HashMap<>();
        map.put("pic_code",pic_code);
        map.put("pic_name",pic_name);
//        map.put("pic_user",pic_user);
//        map.put("pic_phone",pic_phone);
//        map.put("pic_address",pic_address);
//        map.put("pic_chuanzhen",pic_chuanzhen);
        map.put("pic_content",pic_content);

        T_Picture pic = (T_Picture) req.getSession().getAttribute("picInfo");
        map.put("pic_url",pic.getPic_url());
        ModelAndView mav = new ModelAndView();
        int x = pictureServiceImpl.updatePic(map);

        List<T_Picture> picList = (List<T_Picture>) pictureServiceImpl.getAllPic();
        req.getSession().setAttribute("picAllInfo",picList);
        mav.setViewName("pictureUpdate.jsp");
        mav.addObject("updateMsg","修改成功");
//        mav.setViewName("picture.jsp");



        return mav;
    }

    @RequestMapping("/pictureAdd")
    public ModelAndView pictureAdd(@RequestParam(name = "providerId", required = true) String pic_code,
                                   @RequestParam(name = "providerName", required = false) String pic_name,
                                   @RequestParam(name = "people", required = false) String pic_user,
//                                   @RequestParam(name = "phone", required = false) String pic_phone,
//                                   @RequestParam(name = "address", required = false) String pic_address,
//                                 @RequestParam(name = "fax", required = false) String pic_chuanzhen,
                                   @RequestParam(name = "describe", required = false) String pic_content,
                                   @RequestParam(name = "type", required = false) String pic_type,
                                   @RequestParam(name = "url", required = true) String pic_url,
                                   HttpServletRequest req){
        Map<String,Object> map = new HashMap<>();
        map.put("pic_code",pic_code);
        map.put("pic_name",pic_name);
        map.put("pic_user",pic_user);
//        map.put("pic_phone",pic_phone);
//        map.put("pic_address",pic_address);
//        map.put("pic_chuanzhen",pic_chuanzhen);
        map.put("pic_content",pic_content);
        map.put("pic_time", Date.valueOf(LocalDate.now()));
        map.put("pic_type", pic_type);
        map.put("pic_check","未审核");
        map.put("pic_url", pic_url);
        ModelAndView mav = new ModelAndView();
        int x = pictureServiceImpl.addPic(map);

        List<T_Picture> picList = (List<T_Picture>) pictureServiceImpl.getAllPic();
        req.getSession().setAttribute("picAllInfo",picList);
        mav.setViewName("pictureAdd.jsp");
        mav.addObject("addMsg","添加成功");




        return  mav;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(HttpServletRequest req){
        ModelAndView mav = new ModelAndView();

        T_Picture pic = (T_Picture) req.getSession().getAttribute("picInfo");
        int x = pictureServiceImpl.deletePic(pic.getPic_code());
        List<T_Picture> picList = (List<T_Picture>) pictureServiceImpl.getAllPic();
        req.getSession().setAttribute("picAllInfo",picList);
        req.getSession().removeAttribute("picInfo");
        mav.setViewName("picture.jsp");
        mav.addObject("deleteMsg","删除成功");
        return  mav;
    }
//    @RequestMapping("pro")
//    public ModelAndView pro(HttpServletRequest req){
//        ModelAndView mav = new ModelAndView();
//        String checkId = req.getParameter("checkId");
//        T_Picture pic = new T_Picture();
//        if(checkId.equals("1")){
//            pic.setPic_check("审核通过");
//        } else
//        {
//            pic.setPic_check("审核未通过");
//        }
//        req.getSession().setAttribute("picInfo",pic);
//        mav.setViewName("picture.jsp");
//        mav.addObject("checkMsg","审核完成！");
//        return mav;
//    }
}

