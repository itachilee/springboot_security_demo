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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bg_area_user", schema = "dbo")
public class BgAreaUser extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private String user_guid;
    private String user_name;
}
