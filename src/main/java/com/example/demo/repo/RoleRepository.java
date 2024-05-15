package com.example.demo.repo;

import com.example.demo.Try.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository {
    void save(Role role);
}
