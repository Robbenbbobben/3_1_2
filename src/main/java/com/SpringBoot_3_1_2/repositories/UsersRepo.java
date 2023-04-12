package com.SpringBoot_3_1_2.repositories;


import com.SpringBoot_3_1_2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepo extends JpaRepository<User, Integer> {
}
