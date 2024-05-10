package com.example.demosqlite1.controller;

import com.example.demosqlite1.entity.TestEntity;
import com.example.demosqlite1.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("test")
    public String test() {
        TestEntity t = new TestEntity();
        t.setActive(true);
        t.setCode("code");
        t.setType("type");
        testRepository.save(t);
        return "x";
    }
}
