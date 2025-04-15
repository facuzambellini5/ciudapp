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

  @PostMapping("/crear")
  public String createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @GetMapping("/traer")
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/traer/{idUser}")
  public User getUserById(@PathVariable Long idUser) {
    return userService.getUserById(idUser);
  }

  @PutMapping("/editar")
  public String editUser(@RequestBody User user) {
    return userService.editUser(user);
  }
}
