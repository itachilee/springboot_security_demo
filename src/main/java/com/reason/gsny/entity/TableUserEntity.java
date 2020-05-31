package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "TABLE_User", schema = "dbo")
public class TableUserEntity {
    private int userId;
    private int supplierId;
    private int exchangStationId;
    private int villageId;
    private int buildingId;
    private int entranceId;
    private String doorPlate;
    private String userName;
    private String telephone;
    private String identityCard;
    private int directionId;
    private Integer chargesId;
    private Integer conditionId;
    private String remark1;
    private byte[] identityCardFile;
    private String operator;
    private Timestamp createTime;
    private Integer userTypeId;
    private Integer meterIDid;
    private Integer lastWater;

    @Id
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "SupplierID")
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "ExchangStationID")
    public int getExchangStationId() {
        return exchangStationId;
    }

    public void setExchangStationId(int exchangStationId) {
        this.exchangStationId = exchangStationId;
    }

    @Basic
    @Column(name = "VillageID")
    public int getVillageId() {
        return villageId;
    }

    public void setVillageId(int villageId) {
        this.villageId = villageId;
    }

    @Basic
    @Column(name = "BuildingID")
    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    @Basic
    @Column(name = "EntranceID")
    public int getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(int entranceId) {
        this.entranceId = entranceId;
    }

    @Basic
    @Column(name = "DoorPlate")
    public String getDoorPlate() {
        return doorPlate;
    }

    public void setDoorPlate(String doorPlate) {
        this.doorPlate = doorPlate;
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
    @Column(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "IdentityCard")
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Basic
    @Column(name = "DirectionID")
    public int getDirectionId() {
        return directionId;
    }

    public void setDirectionId(int directionId) {
        this.directionId = directionId;
    }

    @Basic
    @Column(name = "ChargesID")
    public Integer getChargesId() {
        return chargesId;
    }

    public void setChargesId(Integer chargesId) {
        this.chargesId = chargesId;
    }

    @Basic
    @Column(name = "ConditionID")
    public Integer getConditionId() {
        return conditionId;
    }

    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    @Basic
    @Column(name = "Remark1")
    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    @Basic
    @Column(name = "IdentityCardFile")
    public byte[] getIdentityCardFile() {
        return identityCardFile;
    }

    public void setIdentityCardFile(byte[] identityCardFile) {
        this.identityCardFile = identityCardFile;
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
    @Column(name = "UserTypeID")
    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Basic
    @Column(name = "MeterIDid")
    public Integer getMeterIDid() {
        return meterIDid;
    }

    public void setMeterIDid(Integer meterIDid) {
        this.meterIDid = meterIDid;
    }

    @Basic
    @Column(name = "lastWater")
    public Integer getLastWater() {
        return lastWater;
    }

    public void setLastWater(Integer lastWater) {
        this.lastWater = lastWater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableUserEntity that = (TableUserEntity) o;
        return userId == that.userId &&
                supplierId == that.supplierId &&
                exchangStationId == that.exchangStationId &&
                villageId == that.villageId &&
                buildingId == that.buildingId &&
                entranceId == that.entranceId &&
                directionId == that.directionId &&
                Objects.equals(doorPlate, that.doorPlate) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(identityCard, that.identityCard) &&
                Objects.equals(chargesId, that.chargesId) &&
                Objects.equals(conditionId, that.conditionId) &&
                Objects.equals(remark1, that.remark1) &&
                Arrays.equals(identityCardFile, that.identityCardFile) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(userTypeId, that.userTypeId) &&
                Objects.equals(meterIDid, that.meterIDid) &&
                Objects.equals(lastWater, that.lastWater);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(userId, supplierId, exchangStationId, villageId, buildingId, entranceId, doorPlate, userName, telephone, identityCard, directionId, chargesId, conditionId, remark1, operator, createTime, userTypeId, meterIDid, lastWater);
        result = 31 * result + Arrays.hashCode(identityCardFile);
        return result;
    }
}
