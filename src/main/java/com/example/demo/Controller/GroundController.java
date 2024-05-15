package com.example.demo.Controller;

import com.example.demo.Service.GroundService;
import com.example.demo.pojo.GroundPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor
public class GroundController {
    private final GroundService groundService;
    @PostMapping("/save")

    public void save(@RequestBody GroundPojo groundPojo){

    }
}
