package com.buta.totalusers.data.compareData;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Compare {
    private double malePercent;
    private double femalePercent;
    private double otherPercent;
}
