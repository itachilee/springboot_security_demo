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
 * 在线的水表信息
 * 在近两个小时内report表中出现过的水表编号会被抽取到此表中
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_water", schema = "dbo")
public class BgAreaWater extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private long water_no;
    private String water_guid;
}
