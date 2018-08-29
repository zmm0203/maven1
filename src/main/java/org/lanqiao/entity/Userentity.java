package org.lanqiao.entity;

import java.util.Date;

public class Userentity {
    public Userentity(){ }
    private int id;
    private String username;
    private String msg;
    private Date createTime;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getMsg() {
        return msg;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

}
