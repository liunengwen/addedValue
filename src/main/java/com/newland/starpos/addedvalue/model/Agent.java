package com.newland.starpos.addedvalue.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Table;

@Data
@Table(name = "agent", schema = "zongliang")
public class Agent {

    @Id
    private Integer a;

    private String aname;
}
