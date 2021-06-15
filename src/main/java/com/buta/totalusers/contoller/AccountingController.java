package com.buta.totalusers.contoller;

import com.buta.totalusers.data.countData.AccountCount;
import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.service.count.AccountingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AccountingController {
    @Autowired
    private AccountingService service;

    @GetMapping(value = "/accountcount")
    public AccountCount getAccountingCount(){
        return service.getAccountingCount();
    }

}
