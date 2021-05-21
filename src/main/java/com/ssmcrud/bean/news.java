package com.ssmcrud.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class news {
    private Integer newsid;

    private String newstitle;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8")
    private Date newsdate;

    private String newsdesc;

    private String newsimagepath;

    private Integer newsrate;

    private Boolean newsischeck;

    private Boolean newsistop;

    private String newscontent;

    public news() {
    }

    @Override
    public String toString() {
        return "news{" +
                "newsid=" + newsid +
                ", newstitle='" + newstitle + '\'' +
                ", newsdate=" + newsdate +
                ", newsdesc='" + newsdesc + '\'' +
                ", newsimagepath='" + newsimagepath + '\'' +
                ", newsrate=" + newsrate +
                ", newsischeck=" + newsischeck +
                ", newsistop=" + newsistop +
                ", newscontent='" + newscontent + '\'' +
                '}';
    }

    public news(Integer newsid, String newstitle, Date newsdate, String newsdesc, String newsimagepath, Integer newsrate, Boolean newsischeck, Boolean newsistop, String newscontent) {
        this.newsid = newsid;
        this.newstitle = newstitle;
        this.newsdate = newsdate;
        this.newsdesc = newsdesc;
        this.newsimagepath = newsimagepath;
        this.newsrate = newsrate;
        this.newsischeck = newsischeck;
        this.newsistop = newsistop;
        this.newscontent = newscontent;
    }

    public news(String newstitle, Date newsdate, String newsdesc, String newsimagepath, Integer newsrate, Boolean newsischeck, Boolean newsistop, String newscontent) {
        this.newstitle = newstitle;
        this.newsdate = newsdate;
        this.newsdesc = newsdesc;
        this.newsimagepath = newsimagepath;
        this.newsrate = newsrate;
        this.newsischeck = newsischeck;
        this.newsistop = newsistop;
        this.newscontent = newscontent;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public Date getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Date newsdate) {
        this.newsdate = newsdate;
    }

    public String getNewsdesc() {
        return newsdesc;
    }

    public void setNewsdesc(String newsdesc) {
        this.newsdesc = newsdesc == null ? null : newsdesc.trim();
    }

    public String getNewsimagepath() {
        return newsimagepath;
    }

    public void setNewsimagepath(String newsimagepath) {
        this.newsimagepath = newsimagepath == null ? null : newsimagepath.trim();
    }

    public Integer getNewsrate() {
        return newsrate;
    }

    public void setNewsrate(Integer newsrate) {
        this.newsrate = newsrate;
    }

    public Boolean getNewsischeck() {
        return newsischeck;
    }

    public void setNewsischeck(Boolean newsischeck) {
        this.newsischeck = newsischeck;
    }

    public Boolean getNewsistop() {
        return newsistop;
    }

    public void setNewsistop(Boolean newsistop) {
        this.newsistop = newsistop;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }
}