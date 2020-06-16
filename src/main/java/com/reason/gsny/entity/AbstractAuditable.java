package com.reason.gsny.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * 抽象类
 * 所有实体数据表类均继承此类
 * 实现自动注册审计字段
 * @author leon
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class AbstractAuditable {
    /**
     * 主键
     * 默认为自增字段
     */
    @Id
    @GeneratedValue
    protected Long id;

    /**
     * 创建时间
     */
    @CreatedDate
    protected Date created_at;
    /**
     * 创建人员
     */
    @CreatedBy
    protected String created_by;

    /**
     * 修改时间
     */
    @LastModifiedDate
    protected Date updated_at;
    /**
     * 修改人员
     */
    @LastModifiedBy
    protected String updated_by;
}