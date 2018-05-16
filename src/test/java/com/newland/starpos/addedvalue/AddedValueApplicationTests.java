package com.newland.starpos.addedvalue;

import com.newland.starpos.addedvalue.service.CountryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddedValueApplicationTests {

    @Autowired
    private CountryService countryService;

    @Test
    public void contextLoads() {
        countryService.getCountry();
    }

}
