package com.newland.starpos.addedvalue.service;

import com.newland.starpos.addedvalue.mapper.AgentMapper;
import com.newland.starpos.addedvalue.mapper.CountryMapper;
import com.newland.starpos.addedvalue.model.Agent;
import com.newland.starpos.addedvalue.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private AgentMapper agentMapper;


    public void getCountry(){
        List<Country> countries = countryMapper.selectAll();
        System.out.println("-----------------------");
        System.out.println(countries.size());

        List<Agent> agents = agentMapper.selectAll();
        System.out.println("-------------------------");
        System.out.println(agents.size());

    }

}
