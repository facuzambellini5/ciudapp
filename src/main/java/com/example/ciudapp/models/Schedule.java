package com.example.ciudapp.models;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
public class Schedule {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idSchedule;

  @Enumerated(EnumType.STRING)
  private DayOfWeek day;

  private LocalTime morningOpening;
  private LocalTime morningClosing;
  private LocalTime afternoonOpening;
  private LocalTime afternoonClosing;
  private boolean isContinuos;

  public Schedule() {}

  public Schedule(
      DayOfWeek day,
      LocalTime morningOpening,
      LocalTime morningClosing,
      LocalTime afternoonOpening,
      LocalTime afternoonClosing,
      boolean isContinuos) {
    this.day = day;
    this.morningOpening = morningOpening;
    this.morningClosing = morningClosing;
    this.afternoonOpening = afternoonOpening;
    this.afternoonClosing = afternoonClosing;
    this.isContinuos = isContinuos;
  }

  public DayOfWeek getDay() {
    return day;
  }

  public void setDay(DayOfWeek day) {
    this.day = day;
  }

  public LocalTime getMorningOpening() {
    return morningOpening;
  }

  public void setMorningOpening(LocalTime morningOpening) {
    this.morningOpening = morningOpening;
  }

  public LocalTime getMorningClosing() {
    return morningClosing;
  }

  public void setMorningClosing(LocalTime morningClosing) {
    this.morningClosing = morningClosing;
  }

  public LocalTime getAfternoonOpening() {
    return afternoonOpening;
  }

  public void setAfternoonOpening(LocalTime afternoonOpening) {
    this.afternoonOpening = afternoonOpening;
  }

  public LocalTime getAfternoonClosing() {
    return afternoonClosing;
  }

  public void setAfternoonClosing(LocalTime afternoonClosing) {
    this.afternoonClosing = afternoonClosing;
  }

  public boolean isContinuos() {
    return isContinuos;
  }

  public void setContinuos(boolean continuos) {
    isContinuos = continuos;
  }
}
