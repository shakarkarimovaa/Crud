package com.exam.exam4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Parent {
    private int id;
    private String name;
    private String surname;
    private int birthDate;
    private String jobName;
}
