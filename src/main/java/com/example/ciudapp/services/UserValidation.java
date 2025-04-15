package com.example.ciudapp.services;

import com.example.ciudapp.repositories.IUserRepository;
import com.example.ciudapp.services.interfaces.IUserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserValidation implements IUserValidation {

  @Autowired IUserRepository userRepo;

  @Override
  public void usernameValidation(String username) {
    if (userRepo.findByUsername(username).isPresent()) {
      throw new RuntimeException(
          "El usuario: '" + username + "' ya existe. Por favor ingrese otro nombre de usuario.");
    }
  }
}
