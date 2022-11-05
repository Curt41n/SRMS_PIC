package cn.wolfcode.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class T_video {
    private String vid ;
    //视频编号
    private String vname ;
    //文件名称
    private String vsize ;
    //文件大小
    private String vtype ;
    //文件类型
    private String vcate ;
    //视频分类
    private String vstae ;
    //审核状态
    private Date uploadtime ;
    //上传时间
    private Integer pv ;
    //浏览数量
    private String vroute;
    //文件路径
    private List<T_priviage> priList ;
    //表示用户对应的权限

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVsize() {
        return vsize;
    }

    public void setVsize(String vsize) {
        this.vsize = vsize;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public String getVcate() {
        return vcate;
    }

    public void setVcate(String vcate) {
        this.vcate = vcate;
    }

    public String getVstae() {
        return vstae;
    }

    public void setVstae(String vstae) {
        this.vstae = vstae;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public List<T_priviage> getPriList() {
        return priList;
    }

    public void setPriList(List<T_priviage> priList) {
        this.priList = priList;
    }


    public String getVroute() {
        return vroute;
    }

    public void setVroute(String vroute) {
        this.vroute = vroute;
    }

    @Override
    public String toString() {
        return "T_video{" +
                "vid='" + vid + '\'' +
                ", vname='" + vname + '\'' +
                ", vsize='" + vsize + '\'' +
                ", vtype='" + vtype + '\'' +
                ", vcate='" + vcate + '\'' +
                ", vstae='" + vstae + '\'' +
                ", uploadtime=" + uploadtime +
                ", pv=" + pv +
                ", vroute='" + vroute + '\'' +
                ", priList=" + priList +
                '}';
    }
}


