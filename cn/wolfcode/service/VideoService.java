package cn.wolfcode.service;

import cn.wolfcode.entity.T_video;

import java.util.List;
import java.util.Map;

public interface VideoService {

    int vAdd(Map<String,Object> paramMap);

    int vUpdate(Map<String,Object> paramMap);

    int vDelete(String vid);

    List<T_video> getAllVideo();

    T_video getVideoByCondition(String vid);
}
