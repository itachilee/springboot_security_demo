package com.reason.gsny.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author leon
 */
@Data
public class TreeEntity {
    private long id;
    private String text;
    private List<TableMeterEntity> children;


}
