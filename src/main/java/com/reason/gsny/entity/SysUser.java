package com.reason.gsny.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Entity
@Table(name = "sys_user", schema = "dbo")
public class SysUser implements Serializable {

    @Id
    private Long id;

    /**
     * 用户编号
     */
    private String usercode;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户角色
     */
    @OneToMany(targetEntity=SysRole.class, fetch= FetchType.EAGER)
    private List<SysRole> roleList;

    public SysUser() {
    }

    public SysUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
