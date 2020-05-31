package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_Notice", schema = "dbo")
public class TableNoticeEntity {
    private int messageId;
    private String type;
    private String receiver;
    private String sender;
    private int looked;
    private String items;
    private String title;
    private String updateUser;
    private String address;
    private String meterid;
    private Timestamp createTime;
    private String content;
    private Integer userId;
    private Integer supplierId;
    private String remindValue;

    @Id
    @Column(name = "MessageID")
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Receiver")
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Basic
    @Column(name = "Sender")
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Basic
    @Column(name = "Looked")
    public int getLooked() {
        return looked;
    }

    public void setLooked(int looked) {
        this.looked = looked;
    }

    @Basic
    @Column(name = "Items")
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "UPDATE_USER")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Meterid")
    public String getMeterid() {
        return meterid;
    }

    public void setMeterid(String meterid) {
        this.meterid = meterid;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "USER_ID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "SUPPLIER_ID")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "REMIND_VALUE")
    public String getRemindValue() {
        return remindValue;
    }

    public void setRemindValue(String remindValue) {
        this.remindValue = remindValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableNoticeEntity that = (TableNoticeEntity) o;
        return messageId == that.messageId &&
                looked == that.looked &&
                Objects.equals(type, that.type) &&
                Objects.equals(receiver, that.receiver) &&
                Objects.equals(sender, that.sender) &&
                Objects.equals(items, that.items) &&
                Objects.equals(title, that.title) &&
                Objects.equals(updateUser, that.updateUser) &&
                Objects.equals(address, that.address) &&
                Objects.equals(meterid, that.meterid) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(content, that.content) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(remindValue, that.remindValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, type, receiver, sender, looked, items, title, updateUser, address, meterid, createTime, content, userId, supplierId, remindValue);
    }
}
