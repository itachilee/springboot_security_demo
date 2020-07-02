package com.reason.gsny.entity.bg;

import com.reason.gsny.entity.AbstractAuditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 获取在线的阀控器的数据
 * 在近两个小时内report表中出现过的阀控器编号会被抽取到此表中
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_meter", schema = "dbo")
public class BgAreaMeter extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private long meter_no;
    private String meter_guid;
}
