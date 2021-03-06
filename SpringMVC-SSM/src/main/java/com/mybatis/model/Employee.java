package com.mybatis.model;

/**
 * Created by guoyong03 on 2017/5/29.
 */
public class Employee {
  private int id;
  private String lastName;
  private String email;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  @Override
  public String toString() {
    return "Employee [id=" + id + ", lastName=" + lastName + ", email="
            + email+" ]" ;
  }
  public Employee(){}
}
