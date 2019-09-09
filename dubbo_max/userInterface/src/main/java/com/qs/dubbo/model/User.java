package com.qs.dubbo.model;

import java.io.Serializable;

/**
 * @author TigerLi
 * @Version 1.0
 * 2019/9/5  14:56
 */
public class User implements Serializable {

    /**用户id*/
    private int id;

    /**用户昵称*/
    private String nick;

    /**用户手机号码*/
    private String phone;

    /**用户邮箱*/
    private String email;

    /**用户住址*/
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
