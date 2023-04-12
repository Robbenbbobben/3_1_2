package com.SpringBoot_3_1_2.service;

import com.SpringBoot_3_1_2.model.User;
import com.SpringBoot_3_1_2.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private UsersRepo usersRepo;
    @Autowired
    public UserServiceImpl(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public List<User> findAll() {
        return usersRepo.findAll();
    }
    @Override
    public User findOne(int id) {
        Optional<User> foundUser = usersRepo.findById(id);
        return foundUser.orElse(null);
    }
    @Override
    @Transactional
    public void save(User user) {
        usersRepo.save(user);
    }
    @Override
    @Transactional
    public void update(int id, User updateUser) {
        updateUser.setId(id);
        usersRepo.save(updateUser);
    }
    @Override
    @Transactional
    public void delete(int id) {
        usersRepo.deleteById(id);
    }
}
