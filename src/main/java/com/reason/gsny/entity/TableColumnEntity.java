package com.reason.gsny.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Table_Column", schema = "dbo")
public class TableColumnEntity {
    private Integer no;
    private String login;
    private Integer supplierId;
    private String columnName;
    private String columnDesc;
    private Integer flag;
    private int id;

    @Basic
    @Column(name = "NO")
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Basic
    @Column(name = "Login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "SupplierID")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "Column_Name")
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "Column_Desc")
    public String getColumnDesc() {
        return columnDesc;
    }

    public void setColumnDesc(String columnDesc) {
        this.columnDesc = columnDesc;
    }

    @Basic
    @Column(name = "flag")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableColumnEntity that = (TableColumnEntity) o;
        return id == that.id &&
                Objects.equals(no, that.no) &&
                Objects.equals(login, that.login) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(columnName, that.columnName) &&
                Objects.equals(columnDesc, that.columnDesc) &&
                Objects.equals(flag, that.flag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, login, supplierId, columnName, columnDesc, flag, id);
    }
}
