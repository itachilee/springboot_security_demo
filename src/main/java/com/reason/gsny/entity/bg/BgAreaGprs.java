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
 * 获取在线的集中器的数据
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_gprs", schema = "dbo")
public class BgAreaGprs extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private long gprs_no;
    private String gprs_guid;
}
