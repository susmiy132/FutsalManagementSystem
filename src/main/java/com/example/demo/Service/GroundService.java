package com.example.demo.Service;

import com.example.demo.Try.Ground;
import com.example.demo.pojo.GroundPojo;

import java.util.List;
import java.util.Optional;

public interface GroundService {
    void savaData(GroundPojo groundPojo);

    void saveData(GroundPojo groundPojo);

    List<Ground> getAll();
    void deleteById(Integer id);

    void deleteByUd(Integer id);

    Optional<Ground>findById(Integer id);

}
