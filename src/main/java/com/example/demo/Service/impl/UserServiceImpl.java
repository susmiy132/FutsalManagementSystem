package com.example.demo.Service.impl;

import com.example.demo.Service.UserService;
import com.example.demo.Try.User;
import com.example.demo.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getUserById(Integer id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public List<User> getAllUser() {
        return List.of();
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteUserById(Integer id) {

    }
}
