package com.example.demo.Service.impl;

import com.example.demo.Service.GroundService;
import com.example.demo.Try.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.repo.GroundRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Getter
@Setter

public class GroundServiceImpl implements GroundService {
    private final GroundRepository groundRepository;

    @Override
    public void savaData(GroundPojo groundPojo) {

    }

    @Override
    public void saveData(GroundPojo groundPojo) {
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setName(groundPojo.getGroundName());
        groundRepository.save(ground);
    }
    @Override
    public List<Ground>getAll(){
        return groundRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUd(Integer id){
        groundRepository.deleteById(id);
    }

    @Override
    public Optional<Ground> findById(Integer id){
        return groundRepository.findById(id);
    }
}
