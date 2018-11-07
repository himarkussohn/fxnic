package com.himarkussohn.controllers;

import com.himarkussohn.services.IFxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: himarkussohn
 * @date: 2018-11-07
 */
@RestController
public class FxRateListController {

    private final IFxListService fxListService;

    @Autowired
    public FxRateListController(IFxListService fxListService) {
        this.fxListService = fxListService;
    }

    @GetMapping("/")
    public String list() {
        return fxListService.getFxRates();
    }
}
