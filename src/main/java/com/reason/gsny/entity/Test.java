package com.reason.gsny.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author leon
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "test", schema = "dbo")
@JsonIgnoreProperties(value = {"children"})
public class Test extends AbstractAuditable implements Serializable {
    @Getter
    @Setter
    private String name;

    /**
     * 父组织
     */
    @JoinColumn(name = "parent_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Test parent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Setter
    private Set<Test> children;


    @JsonIgnore
    public Set<Test> getChildren() {
        return children;
    }
}
