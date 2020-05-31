package com.reason.gsny.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Entity
@Table(name = "sys_role", schema = "dbo")
public class SysRole implements Serializable {

    @Id
    private Long id;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色拥有的权限
     */
    @OneToMany(targetEntity=SysPermission.class, fetch= FetchType.EAGER)
    private List<SysPermission> permissionList;

    public SysRole() {
    }

    public SysRole(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }
}
