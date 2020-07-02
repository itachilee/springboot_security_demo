package com.reason.gsny.entity.bg;

import com.reason.gsny.entity.AbstractAuditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_device", schema = "dbo")
public class BgAreaDevice extends AbstractAuditable {

    private String area_guid;
    private String area_name;
    private String device;
    private long device_type;
}
