package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.Try.User;
import com.example.demo.pojo.UserPojo;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public GlobalApiResponse<List<User>> getAllUser(){
        return GlobalApiResponse
                .<List<User>>builder()
                .data(userService.getAllUser())
                .statusCode(200)
                .message("User reterieved successfully")
                .build();
    }
    @PostMapping
    public GlobalApiResponse<String> saveUser(@RequestBody @Validated UserPojo){
        User user = new User();
        user.setId(userPojo.getId());
        user.setName(userPojo.getName());
        userService.saveUser(user);
        return GlobalApiResponse
                .<String>builder()
                .data("Saved")
                .statusCode(200)
                .message("User saved successfully")
                .build();
    }

    @PutMapping("/{id}")
    public GlobalApiResponse<String> updateUser(@PathVariable Integer id, @RequestBody @Validated UserPojo userPojo) {
        User user = new User();
        user.setId(id);
        user.setName(userPojo.getName());
        userService.saveUser(user);
        return GlobalApiResponse
                .<String>builder()
                .data("updated")
                .statusCode(200)
                .message("User updated successfully")
                .build();
    }

    @GetMapping("/{id}")
    public GlobalApiResponse<User> getUserById(@PathVariable Integer id) {
        Optional<User> user = Optional.ofNullable(userService.getUserById(id));
        return user.map(value ->
                        GlobalApiResponse.<User>builder()
                                .data(value)
                                .statusCode(200)
                                .message("User retrieved successfully")
                                .build())
                .orElseGet(() ->
                        GlobalApiResponse.<User>builder()
                                .statusCode(404)
                                .message("User not found")
                                .build());
    }

    @DeleteMapping("/{id}")
    public GlobalApiResponse<String> deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return GlobalApiResponse
                .<String>builder()
                .data("deleted")
                .statusCode(200)
                .message("User deleted successfully")
                .build();
    }
}
