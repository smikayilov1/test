package com.buta.totalusers.service.count;

import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.data.countData.LogisticCount;
import com.buta.totalusers.repository.count.LogisticCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogisticCountService {
    @Autowired
    private LogisticCountRepository repository;
    @Autowired
    private LogisticCount logisticCount;

    public LogisticCount getLogisticCount(){
        changeObject(repository.findLogisticCount());
        return logisticCount;
    }

    public  void changeObject(Integer integer){
        this.logisticCount.setCount(integer);
    }
}
