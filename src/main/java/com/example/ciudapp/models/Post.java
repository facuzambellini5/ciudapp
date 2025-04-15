package com.example.ciudapp.models;

import com.example.ciudapp.enums.Categorias;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPost;

  @ManyToOne private EntityPlace entity;

  private String title;
  private String description;
  private Categorias category; // VER
  private LocalDate startDate;
  private LocalDate endDate;
  private String imageUrl;

  public Post() {}

  public Post(
      Long idPost,
      EntityPlace entity,
      String title,
      String description,
      Categorias category,
      LocalDate startDate,
      LocalDate endDate,
      String imageUrl) {
    this.idPost = idPost;
    this.entity = entity;
    this.title = title;
    this.description = description;
    this.category = category;
    this.startDate = startDate;
    this.endDate = endDate;
    this.imageUrl = imageUrl;
  }

  public Long getIdPost() {
    return idPost;
  }

  public void setIdPost(Long idPost) {
    this.idPost = idPost;
  }

  public EntityPlace getEntity() {
    return entity;
  }

  public void setEntity(EntityPlace entity) {
    this.entity = entity;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Categorias getCategory() {
    return category;
  }

  public void setCategory(Categorias category) {
    this.category = category;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
}
