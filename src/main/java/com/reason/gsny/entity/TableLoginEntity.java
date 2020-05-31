package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_Login", schema = "dbo")
public class TableLoginEntity {
    private int no;
    private String login;
    private String passWord;
    private String userName;
    private String userBz;
    private String deptNo;
    private String deptName;
    private Integer lv;
    private Integer supplierId;
    private Integer exchangStationId;
    private Integer villageId;
    private Integer buildingId;
    private Integer entranceId;
    private String setFuncs;
    private String operator;
    private Timestamp createTime;
    private Double proportion;
    private Double areaprice;
    private Double calculateprice;
    private int id;

    @Basic
    @Column(name = "NO")
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
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
    @Column(name = "PassWord")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "UserBZ")
    public String getUserBz() {
        return userBz;
    }

    public void setUserBz(String userBz) {
        this.userBz = userBz;
    }

    @Basic
    @Column(name = "deptNo")
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Basic
    @Column(name = "deptName")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "lv")
    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
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
    @Column(name = "ExchangStationID")
    public Integer getExchangStationId() {
        return exchangStationId;
    }

    public void setExchangStationId(Integer exchangStationId) {
        this.exchangStationId = exchangStationId;
    }

    @Basic
    @Column(name = "VillageID")
    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    @Basic
    @Column(name = "BuildingID")
    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    @Basic
    @Column(name = "EntranceID")
    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    @Basic
    @Column(name = "SetFuncs")
    public String getSetFuncs() {
        return setFuncs;
    }

    public void setSetFuncs(String setFuncs) {
        this.setFuncs = setFuncs;
    }

    @Basic
    @Column(name = "Operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
    @Column(name = "proportion")
    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    @Basic
    @Column(name = "Areaprice")
    public Double getAreaprice() {
        return areaprice;
    }

    public void setAreaprice(Double areaprice) {
        this.areaprice = areaprice;
    }

    @Basic
    @Column(name = "Calculateprice")
    public Double getCalculateprice() {
        return calculateprice;
    }

    public void setCalculateprice(Double calculateprice) {
        this.calculateprice = calculateprice;
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
        TableLoginEntity that = (TableLoginEntity) o;
        return no == that.no &&
                id == that.id &&
                Objects.equals(login, that.login) &&
                Objects.equals(passWord, that.passWord) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userBz, that.userBz) &&
                Objects.equals(deptNo, that.deptNo) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(lv, that.lv) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(exchangStationId, that.exchangStationId) &&
                Objects.equals(villageId, that.villageId) &&
                Objects.equals(buildingId, that.buildingId) &&
                Objects.equals(entranceId, that.entranceId) &&
                Objects.equals(setFuncs, that.setFuncs) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(proportion, that.proportion) &&
                Objects.equals(areaprice, that.areaprice) &&
                Objects.equals(calculateprice, that.calculateprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, login, passWord, userName, userBz, deptNo, deptName, lv, supplierId, exchangStationId, villageId, buildingId, entranceId, setFuncs, operator, createTime, proportion, areaprice, calculateprice, id);
    }
}
