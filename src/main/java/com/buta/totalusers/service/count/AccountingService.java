package com.buta.totalusers.service.count;

import com.buta.totalusers.data.countData.AccountCount;
import com.buta.totalusers.repository.count.AccountingCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountingService {
    @Autowired
    private AccountingCountRepository repository;
    @Autowired
    private AccountCount accountCount;

    public AccountCount getAccountingCount(){
        changeObject(repository.findAccountingCount());
        return accountCount;
    }

    public  void changeObject(Integer integer){
        this.accountCount.setCount(integer);
    }
}
