package com.example.demo.Service.impl;

import com.example.demo.Service.RoleService;
import com.example.demo.Try.Role;
import com.example.demo.pojo.RolePojo;
import com.example.demo.repo.RoleRepository;

import java.util.List;
import java.util.Optional;

public class RolesServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RolesServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Optional<Role> getRoleById(Integer id){
        return roleRepository.findById(id);
    }
    @Override
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }
    @Override
    public void saveRole(Role role){
        roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(Integer id){
        roleRepository.deleteById(id);
    }

    @Override
    public void savaData(RolePojo rolePojo) {

    }

    @Override
    public void saveData(RolePojo rolePojo) {

    }

    @Override
    public List<Role> getAll() {
        return List.of();
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUd(Integer id) {

    }

    @Override
    public Optional<Role> findById(Integer id) {
        return Optional.empty();
    }
}
