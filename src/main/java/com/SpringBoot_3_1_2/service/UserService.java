package com.SpringBoot_3_1_2.service;


import com.SpringBoot_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(int id);
    void save(User user);
    void update(int id, User updateUser);
    void delete(int id);
}
