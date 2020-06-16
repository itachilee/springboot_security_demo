package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.reason.gsny.entity.bg.BgAreaUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 中间类，封装区域用户
 * @author leon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaUserGroup implements Serializable {
//    private BgAreaUser bgAreaUser;
    @JsonProperty("value")
    private long userCount;
    private String areaGuid;
    @JsonProperty("name")
    private String areaName;
}
