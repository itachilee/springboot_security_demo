package com.reason.gsny.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.io.Serializable;
import java.util.Date;

/**
 * @author leon
 */
@Data
@Log4j
public class User implements Serializable {
    private static final long serialVersionUID = 6222176558369919436L;
    @JsonProperty("name")
    private String userName;

    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;



}