package com.ananda.signupout.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ananda.signupout.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
