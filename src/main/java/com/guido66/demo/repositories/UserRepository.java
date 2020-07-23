package com.guido66.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guido66.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
