package com.exam.exam4.service;

import com.exam.exam4.entity.Child;
import com.exam.exam4.repository.ChildRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChildService {

    @Autowired
    private ChildRepository childRepository;


    public Child create(Child child) {
        return childRepository.create(child);
    }

    public void delete(Long id){
        childRepository.delete(id);
    }
    public Child update(Long id,Child child){
        return childRepository.update(id,child);
    }



}
