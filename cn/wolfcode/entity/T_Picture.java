package cn.wolfcode.entity;

import java.sql.Date;
import java.util.List;

public class T_Picture {
    private String pic_code;
    private String pic_name;
    private String pic_user;
    private String pic_phone;
    private String pic_address;
    private String pic_chuanzhen;
    private String pic_content;

    private Date pic_time;
    private String pic_type;
    private String pic_check;
    private String pic_url;

    List<T_Picture> pictureList;

    public Date getPic_time() {
        return pic_time;
    }

    public void setPic_time(Date pic_time) {
        this.pic_time = pic_time;
    }

    public String getPic_type() {
        return pic_type;
    }

    public void setPic_type(String pic_type) {
        this.pic_type = pic_type;
    }

    public String getPic_check() {
        return pic_check;
    }

    public void setPic_check(String pic_check) {
        this.pic_check = pic_check;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public List<T_Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<T_Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public String getPic_code() {
        return pic_code;
    }

    public void setPic_code(String pic_code) {
        this.pic_code = pic_code;
    }

    public String getPic_name() {
        return pic_name;
    }

    public void setPic_name(String pic_name) {
        this.pic_name = pic_name;
    }

    public String getPic_user() {
        return pic_user;
    }

    public void setPic_user(String pic_user) {
        this.pic_user = pic_user;
    }

    public String getPic_phone() {
        return pic_phone;
    }

    public void setPic_phone(String pic_phone) {
        this.pic_phone = pic_phone;
    }

    public String getPic_address() {
        return pic_address;
    }

    public void setPic_address(String pic_address) {
        this.pic_address = pic_address;
    }

    public String getPic_chuanzhen() {
        return pic_chuanzhen;
    }

    public void setPic_chuanzhen(String pic_chuanzhen) {
        this.pic_chuanzhen = pic_chuanzhen;
    }

    public String getPic_content() {
        return pic_content;
    }

    public void setPic_content(String pic_content) {
        this.pic_content = pic_content;
    }

    @Override
    public String toString() {
        return "T_Picture{" +
                "pic_code='" + pic_code + '\'' +
                ", pic_name='" + pic_name + '\'' +
                ", pic_user='" + pic_user + '\'' +
                ", pic_phone='" + pic_phone + '\'' +
                ", pic_address='" + pic_address + '\'' +
                ", pic_chuanzhen='" + pic_chuanzhen + '\'' +
                ", pic_content='" + pic_content + '\'' +
                ", pic_time=" + pic_time +
                ", pic_type='" + pic_type + '\'' +
                ", pic_check='" + pic_check + '\'' +
                ", pic_url='" + pic_url + '\'' +
                ", pictureList=" + pictureList +
                '}';
    }

}
