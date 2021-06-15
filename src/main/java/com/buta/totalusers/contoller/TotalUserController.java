package com.buta.totalusers.contoller;

import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.data.countData.TotalUserCount;
import com.buta.totalusers.service.count.TotalUserCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TotalUserController {
    @Autowired
    private TotalUserCountService service;

    @GetMapping("/totalcount")
    public TotalUserCount getTotalCount(){
        return service.getTotalCount();
    }
}
