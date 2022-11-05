package cn.wolfcode.service;

import cn.wolfcode.entity.T_Picture;

import java.util.List;
import java.util.Map;

public interface PictureService {
    T_Picture getPic(String pic_code);
    List<T_Picture> getAllPic();

    int updatePic(Map<String,Object> paramMap );

    int addPic(Map<String,Object> paramMap );

    int deletePic(String pic_code);

}
