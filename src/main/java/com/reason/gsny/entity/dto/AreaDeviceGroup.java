package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
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
    /**
     * 设备数
     */
    @JsonProperty("value")
    @ApiModelProperty(value = "设备数", required = true)
    private long device_count;
    /**
     * 设备类型
     * enum 1:集中器 2:集中器 3:阀控器 4:水表
     */
    @ApiModelProperty(value = "设备类型* enum 1:集中器 2:集中器 3:阀控器 4:水表", required = true)
    private long device_type;
    /**
     * 设备名称
     */
    @JsonProperty("name")
    @ApiModelProperty(value = "设备名称", required = true)
    private String device_name;
}
