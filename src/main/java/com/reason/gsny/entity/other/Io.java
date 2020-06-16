package com.reason.gsny.entity.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * io实体类
 * 用于生成io口控制命令实体
 * @author leon
 */
@Data
@ToString
public class Io implements Serializable {
    @JsonProperty("IO1")
    private int IO1;
    @JsonProperty("IO2")
    private int IO2;
    @JsonProperty("IO3")
    private int IO3;
    @JsonProperty("IO4")
    private int IO4;
    @JsonProperty("IO5")
    private int IO5;
}
