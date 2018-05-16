package com.newland.starpos.addedvalue.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Country {

    @Id
    private  Integer id;

    private String countryname;

    private String countrycode;
}
