package com.tms.webApp.entity;

public class User {
  private String name;
  private String lastName;
  private int age;
  private final int id;
  private static int counter;

  public User(String name, String lastName, int age) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    id = counter;
    counter++;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public int getId() {
    return id;
  }
}