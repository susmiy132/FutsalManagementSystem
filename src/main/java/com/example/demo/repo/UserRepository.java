package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    List<Object> findById(Integer userId);
}
