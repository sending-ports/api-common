package com.logistic.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String name;
  private String email;
  private String telephone;
  private String phone;
  private Date birthday;

  public User(){}

  public User(String name, String email, String telephone, String phone, Date birthday){
    this.name = name;
    this.email = email;
    this.telephone = telephone;
    this.phone = phone;
    this.birthday = birthday;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

 public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Date getBirthday() {
    return birthday;
  }

  @Override
  public String toString() {
      return String.format("User[id=%d, name='%s', phone='%s']", id, name, phone);
  }
}