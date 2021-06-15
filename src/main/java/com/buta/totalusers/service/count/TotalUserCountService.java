package com.buta.totalusers.service.count;

import com.buta.totalusers.data.countData.ItCount;
import com.buta.totalusers.data.countData.TotalUserCount;
import com.buta.totalusers.repository.count.TotalUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalUserCountService {
    @Autowired
    private TotalUserRepository repository;
    @Autowired
    private TotalUserCount totalUserCount;
    public TotalUserCount getTotalCount(){
        changeObject(repository.findTotalUserCount());
        return totalUserCount;
    }

    public void changeObject(Integer integer){
        this.totalUserCount.setCount(integer);
    }
}
