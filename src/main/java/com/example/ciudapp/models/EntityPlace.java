package com.example.ciudapp.models;

import com.example.ciudapp.enums.EntityType;
import jakarta.persistence.*;

import java.util.List;

/**
 * EntityPlace representa una entidad; negocio, empresa, emprendimiento.
 * Contiene atributos como nombre, descripcion, etc.
 */

@Entity
public class EntityPlace {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEntidad;

  /**
   * Cada EntityPlace puede tener muchas publicaciones.
   * Tiene una List de Post
   */
  @OneToMany private List<Post> posts;

  /**
   * Varios EntityPlace solo pueden tener un duenio.
   */
  @ManyToOne private User owner;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "entity_id")
  private List<Schedule> schedules;

  @ManyToMany
  @JoinTable(
      name = "entity_event",
      joinColumns = @JoinColumn(name = "entity_id"),
      inverseJoinColumns = @JoinColumn(name = "event_id"))
  private List<Event> events;

  private String name;
  private String description;
  private String location;
  private String phone;
  private String link;
  private EntityType entityType;
  private String email;
  private String profileImageUrl;
  private String coverImageUrl;

  public EntityPlace() {}

  public EntityPlace(
      Long idEntidad,
      List<Post> posts,
      User owner,
      List<Schedule> schedules,
      List<Event> events,
      String name,
      String description,
      String location,
      String phone,
      String link,
      EntityType entityType,
      String email,
      String profileImageUrl,
      String coverImageUrl) {
    this.idEntidad = idEntidad;
    this.posts = posts;
    this.owner = owner;
    this.schedules = schedules;
    this.events = events;
    this.name = name;
    this.description = description;
    this.location = location;
    this.phone = phone;
    this.link = link;
    this.entityType = entityType;
    this.email = email;
    this.profileImageUrl = profileImageUrl;
    this.coverImageUrl = coverImageUrl;
  }

  public Long getIdEntidad() {
    return idEntidad;
  }

  public void setIdEntidad(Long idEntidad) {
    this.idEntidad = idEntidad;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public List<Schedule> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<Schedule> schedules) {
    this.schedules = schedules;
  }

  public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public EntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }

  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }
}
