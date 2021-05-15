package com.ssmcrud.bean;

import java.util.Date;

public class comment {
    private Integer commentid;

    private String commenttitle;

    private Date commentdate;

    private String commentcontent;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommenttitle() {
        return commenttitle;
    }

    public void setCommenttitle(String commenttitle) {
        this.commenttitle = commenttitle == null ? null : commenttitle.trim();
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }
}