package com.buta.totalusers.service.compare;

import com.buta.totalusers.data.compareData.Compare;
import com.buta.totalusers.repository.compare.FemaleRepository;
import com.buta.totalusers.repository.compare.MaleRepository;
import com.buta.totalusers.repository.compare.OtherRepository;
import com.buta.totalusers.repository.count.TotalUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {
    @Autowired
    private MaleRepository repository;
    @Autowired
    private FemaleRepository femaleRepository;

    @Autowired
    private OtherRepository otherRepository;
    @Autowired
    private Compare count;
    @Autowired
    TotalUserRepository totalUserRepository;
    public Compare getMalepercantage(){
        changeObject(repository.findMaleUsers(),
                femaleRepository.findFemaleUsers(),
                otherRepository.findOtherUsers());
        return count;
    }

    public  void changeObject(Integer male,Integer female,Integer other){
       int allUsers=totalUserRepository.findTotalUserCount();
       count.setFemalePercent(Math.ceil(female*100/(double)allUsers));
       count.setMalePercent(Math.ceil(male*100/(double)allUsers));
       count.setOtherPercent(Math.ceil(other*100/(double)allUsers));
    }
}
