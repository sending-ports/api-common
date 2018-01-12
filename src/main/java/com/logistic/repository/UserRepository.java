package com.logistic.repository;

import java.util.List;

import com.logistic.models.*;

public interface UserRepository {

  void create(User user);
  User findById(Long id);
  void update(User user);
  void delete(Long id);
  List<User> findAll();

}