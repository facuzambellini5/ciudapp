package com.example.ciudapp.services.interfaces;

import com.example.ciudapp.models.User;

import java.util.List;

public interface IUserService {

    String createUser(User user);

    List<User> getUsers();

    User getUserById(Long idUser);

    String editUser(User user);

    String deleteUser(Long idUser);




    //CRUD = create, read, update, delete
}
