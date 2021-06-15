package com.buta.totalusers.contoller;

import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.data.countData.LogisticCount;
import com.buta.totalusers.service.count.LogisticCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LogisticCountController {
    @Autowired
    private LogisticCountService service;

    @GetMapping(value = "/logisticount")
    public LogisticCount getLogisCount(){
        return service.getLogisticCount();
    }

}
