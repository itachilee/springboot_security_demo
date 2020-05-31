package com.reason.gsny.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@ToString
@Entity
@Table(name = "sys_permission", schema = "dbo")
public class SysPermission implements Serializable {

    @Id
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限字符串
     */
    private String code;

    /**
     * 资源类型
     */
    private Integer type;

    /**
     * URL
     */
    private String url;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 父菜单ID
     */
    private Long pid;

}
