package com.buta.totalusers.contoller;

import com.buta.totalusers.data.compareData.Compare;
import com.buta.totalusers.service.compare.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GenderPercentController {
    @Autowired
    private GenderService service;
    @GetMapping(value = "/genderpercent")
    public Compare compareMale(){
        return service.getMalepercantage();
    }
}
