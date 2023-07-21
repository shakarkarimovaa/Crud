package com.exam.exam4.service;

import com.exam.exam4.entity.Child;
import com.exam.exam4.entity.Parent;
import com.exam.exam4.repository.ChildRepository;
import com.exam.exam4.repository.ParentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    private ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    public Parent create(Parent parent) {
        return parentRepository.create(parent);
    }

    public List<Parent> getAll(Parent parent) {
        return parentRepository.getAll(parent);
    }

    public void delete(int id) {
        parentRepository.delete(id);
    }
}
