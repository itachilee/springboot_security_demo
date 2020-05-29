package com.reason.gsny.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 6222176558369919436L;
    @JsonProperty("name")
    private String userName;

    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}