package cn.wolfcode.dao;

import cn.wolfcode.entity.T_video;

import java.util.List;
import java.util.Map;

public interface VideoDao {

    int videoAdd(Map<String,Object> paramMap);

    int videoUpdate(Map<String,Object> paramMap);

    int videoDelete(String str);
    T_video selectVideoById(String Id);

    List<T_video> selectAllVideo();
}
