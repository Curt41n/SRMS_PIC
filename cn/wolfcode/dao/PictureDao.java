package cn.wolfcode.dao;

import cn.wolfcode.entity.T_Picture;

import java.util.List;
import java.util.Map;

public interface PictureDao {
    T_Picture selectPictureByCode(String Code);
    List<T_Picture> selectPictureAll();

    int updatePicture(Map<String,Object> paramMap );

    int addPicture(Map<String,Object> paramMap );

    int deletePicture(String Code);
}