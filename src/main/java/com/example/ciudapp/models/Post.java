package com.example.ciudapp.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPost;

  @ManyToOne private EntityPlace entity;

  private String title;
  private String description;
  private LocalDate startDate;
  private LocalDate endDate;
  private String imageUrl;

  public Post() {}

  public Post(
      Long idPost,
      EntityPlace entity,
      String title,
      String description,
      LocalDate startDate,
      LocalDate endDate,
      String imageUrl) {
    this.idPost = idPost;
    this.entity = entity;
    this.title = title;
    this.description = description;
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
