package com.example.demosqlite1.repository;

import com.example.demosqlite1.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity, Long> {
}
