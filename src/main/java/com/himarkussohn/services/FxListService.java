package com.himarkussohn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

/**
 * @author: himarkussohn
 * @date: 2018-11-07
 */
@Service
public class FxListService implements IFxListService {

    private final RestOperations restTemplate;

    @Autowired
    public FxListService(RestOperations restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getFxRates() {
        return restTemplate.getForObject("http://old.lb.lt//webservices/FxRates/FxRates.asmx/getCurrentFxRates?tp=EU", String.class);
    }
}
