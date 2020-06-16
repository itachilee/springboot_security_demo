package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 中间类，封装区域设备
 * @author leon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaDeviceGroup {
    @JsonProperty("value")
    private long deviceCount;
    private String deviceType;
    @JsonProperty("name")
    private String deviceName;
}
