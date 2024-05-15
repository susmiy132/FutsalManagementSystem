package com.example.demo.repo;

import com.example.demo.Try.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository {
    void save(Role role);

    Optional<Role> findById(Integer id);

    void deleteById(Integer id);

    List<Role> findAll();

}


