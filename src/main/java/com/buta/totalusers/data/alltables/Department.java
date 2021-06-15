package com.buta.totalusers.data.alltables;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name="departments")
public class Department {
    @Id
    private int id;
    private String names;
}
