package com.reason.gsny.entity.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用于接收jwt密钥申请请求
 * @author leon
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest implements Serializable {

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

}
