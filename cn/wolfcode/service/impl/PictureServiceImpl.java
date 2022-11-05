package cn.wolfcode.service.impl;

import cn.wolfcode.dao.PictureDao;
import cn.wolfcode.service.PictureService;
import cn.wolfcode.entity.T_Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;
    @Override
    public T_Picture getPic(String pic_code) {
        return pictureDao.selectPictureByCode(pic_code);
    }

    @Override
    public List<T_Picture> getAllPic() {
        return pictureDao.selectPictureAll();
    }

    @Override
    public int updatePic(Map<String,Object> paramMap ) {
        return pictureDao.updatePicture(paramMap);
    }

    @Override
    public int addPic(Map<String, Object> paramMap) {
        return pictureDao.addPicture(paramMap);
    }

    @Override
    public int deletePic(String pic_code) {
        return pictureDao.deletePicture(pic_code);
    }
}
