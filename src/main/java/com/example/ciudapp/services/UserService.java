package com.example.ciudapp.services;

import com.example.ciudapp.models.User;
import com.example.ciudapp.repositories.IUserRepository;
import com.example.ciudapp.services.interfaces.IUserService;
import com.example.ciudapp.services.interfaces.IUserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserRepository userRepo;
    @Autowired
    IUserValidation userValidation;


    @Override
    public String createUser(User user) {
        userValidation.usernameValidation(user.getUsername());
        userRepo.save(user);
        return "Usuario creado exitosamente.";
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long idUser) {
        User user = userRepo.findById(idUser).orElse(null);
        if(user == null){
            throw new RuntimeException("Usuario no encontrado.");
        }
        return user;
    }

    @Override
    public String editUser(User user) {
        userRepo.save(user);
        return "Usuario editado correctamente.";
    }

    @Override
    public String deleteUser(Long idUser) {
        userRepo.deleteById(idUser);
        return "Usuario eliminado correctamente.";
    }
}
