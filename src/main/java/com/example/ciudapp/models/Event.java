package com.example.ciudapp.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEvent;

  @ManyToMany(mappedBy = "events")
  private List<EntityPlace> entities;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "event_id")
  private List<Schedule> schedules;

  private LocalDate startDate;
  private LocalDate endDate;
  private String title;
  private String description;
  private String location;
  private String locationUrl;
  private String imagenUrl;

  public Event() {}

  public Event(
      Long idEvent,
      List<EntityPlace> entities,
      List<Schedule> schedules,
      LocalDate startDate,
      LocalDate endDate,
      String title,
      String description,
      String location,
      String locationUrl,
      String imagenUrl) {
    this.idEvent = idEvent;
    this.entities = entities;
    this.schedules = schedules;
    this.startDate = startDate;
    this.endDate = endDate;
    this.title = title;
    this.description = description;
    this.location = location;
    this.locationUrl = locationUrl;
    this.imagenUrl = imagenUrl;
  }

  public Long getIdEvent() {
    return idEvent;
  }

  public void setIdEvent(Long idEvent) {
    this.idEvent = idEvent;
  }

  public List<EntityPlace> getEntities() {
    return entities;
  }

  public void setEntities(List<EntityPlace> entities) {
    this.entities = entities;
  }

  public List<Schedule> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<Schedule> schedules) {
    this.schedules = schedules;
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

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLocationUrl() {
    return locationUrl;
  }

  public void setLocationUrl(String locationUrl) {
    this.locationUrl = locationUrl;
  }

  public String getImagenUrl() {
    return imagenUrl;
  }

  public void setImagenUrl(String imagenUrl) {
    this.imagenUrl = imagenUrl;
  }
}
