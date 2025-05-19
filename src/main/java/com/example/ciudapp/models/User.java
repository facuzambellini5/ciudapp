package com.example.ciudapp.models;

import com.example.ciudapp.enums.UserRole;
import jakarta.persistence.*;

import java.util.List;

@jakarta.persistence.Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idUser;

  private String username;
  private String name;
  private String lastName;
  private String password;

  @Enumerated(EnumType.STRING)
  private UserRole role;

  private String email;
  private String recoveryEmail;

  @OneToMany(mappedBy = "owner")
  private List<EntityPlace> entities;

  public User() {}

  public User(
      String username,
      Long idUser,
      String name,
      String lastName,
      String password,
      UserRole role,
      String email,
      String recoveryEmail,
      List<EntityPlace> entities) {
    this.username = username;
    this.idUser = idUser;
    this.name = name;
    this.lastName = lastName;
    this.password = password;
    this.role = role;
    this.email = email;
    this.recoveryEmail = recoveryEmail;
    this.entities = entities;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Long getIdUser() {
    return idUser;
  }

  public void setIdUser(Long idUser) {
    this.idUser = idUser;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserRole getRole() {
    return role;
  }

  public void setRole(UserRole role) {
    this.role = role;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRecoveryEmail() {
    return recoveryEmail;
  }

  public void setRecoveryEmail(String recoveryEmail) {
    this.recoveryEmail = recoveryEmail;
  }

  public List<EntityPlace> getEntities() {
    return entities;
  }

  public void setEntities(List<EntityPlace> entities) {
    this.entities = entities;
  }
}
