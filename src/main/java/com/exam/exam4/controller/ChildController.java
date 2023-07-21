package com.exam.exam4.controller;

import com.exam.exam4.entity.Child;
import com.exam.exam4.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/childs")
public class ChildController {
    @Autowired
    private ChildService childService;

    @PostMapping
    public Child create(@RequestBody Child child){
        return childService.create(child);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "id") Long id){
        childService.delete(id);
    }

    @PutMapping("/{id}")
    public Child update(@PathVariable(value = "id")Long id, @RequestBody Child child){
        return childService.update(id,child);
    }

}
