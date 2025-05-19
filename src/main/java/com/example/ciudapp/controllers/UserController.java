package com.example.ciudapp.controllers;

import com.example.ciudapp.models.User;
import com.example.ciudapp.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired IUserService userService;

  // GET POST PUT DELETE

  @PostMapping("/save")
  public String createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @GetMapping("/get")
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/get/{idUser}")
  public User getUserById(@PathVariable Long idUser) {
    return userService.getUserById(idUser);
  }

  @PutMapping("/edit")
  public String editUser(@RequestBody User user) {
    return userService.editUser(user);
  }
}
