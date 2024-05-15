package com.example.demo.Service;

import com.example.demo.Try.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUser();
    void saveUser(User user);
    void deleteUserById(Integer id);
}
