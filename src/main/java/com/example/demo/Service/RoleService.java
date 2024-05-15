package com.example.demo.Service;

import com.example.demo.Try.Ground;
import com.example.demo.Try.Role;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.pojo.RolePojo;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAllRoles();

    void saveRole(Role role);

    void deleteRoleById(Integer id);

    void savaData(RolePojo rolePojo);

    void saveData(RolePojo rolePojo);

    List<Role> getAll();
    void deleteById(Integer id);

    void deleteByUd(Integer id);

    Optional<Role> findById(Integer id);
}
