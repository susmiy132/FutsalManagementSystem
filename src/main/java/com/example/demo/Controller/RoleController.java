package com.example.demo.Controller;

import com.example.demo.Service.RoleService;
import com.example.demo.pojo.RolePojo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    public void save(@RequestBody RolePojo rolePojo){
    }
}
