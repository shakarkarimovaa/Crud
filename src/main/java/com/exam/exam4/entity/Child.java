package com.exam.exam4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Child {


    private int id;
    private String name;
    
    private Date birthDate;
    private int parentId;
}
