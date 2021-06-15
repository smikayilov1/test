package com.buta.totalusers.contoller;

import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.service.count.ItCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ItCountController {
    @Autowired
    private ItCountService service;

    @GetMapping(value = "/itcount")
    public ItCount getAll(){
        return service.getItCount();
    }
}
