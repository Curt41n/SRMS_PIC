//package cn.wolfcode.service.impl;
//
//import cn.wolfcode.dao.VideoDao;
//import cn.wolfcode.entity.T_video;
//import cn.wolfcode.service.VideoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class VideoServiceImpl implements VideoService {
//
//    @Autowired
//    VideoDao videoMapper;
//
//    @Override
//    public int vAdd(Map<String, Object> paramMap) {
//        return videoMapper.videoAdd(paramMap);
//    }
//
//    @Override
//    public int vDelete(String str) {
//        return videoMapper.videoDelete("vid");
//    }
//
//    @Override
//    public List<T_video> getAllVideo() {
//        return videoMapper.selectAllVideo();
//    }
//
//    @Override
//    public T_video getVideoByCondition(String vid) {
//        return videoMapper.selectVideoById(vid);
//    }
//
//    @Override
//    public int vUpdate(Map<String, Object> paramMap) {
//        return videoMapper.videoUpdate(paramMap);
//    }
//}
