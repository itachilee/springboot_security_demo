package com.reason.gsny.entity.bg;


import com.reason.gsny.entity.AbstractAuditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_colllector", schema = "dbo")
public class BgAreaCollector extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private long collector_no;
    private String collector_guid;
}
