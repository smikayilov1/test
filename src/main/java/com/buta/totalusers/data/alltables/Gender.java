package com.buta.totalusers.data.alltables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Gender {
    @Id
    private int id;
    private String names;
}
