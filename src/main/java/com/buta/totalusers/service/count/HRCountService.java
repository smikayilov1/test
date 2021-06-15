package com.buta.totalusers.service.count;

import com.buta.totalusers.data.countData.HRCount;
import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.repository.count.HRCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRCountService {
    @Autowired
    private HRCountRepository repository;
    @Autowired
    private HRCount hrCount;
    public HRCount getHrCount(){
        changeObject(repository.findHRCount());
        return hrCount;
    }

    public void changeObject(Integer integer){
        this.hrCount.setCount(integer);
    }
}
