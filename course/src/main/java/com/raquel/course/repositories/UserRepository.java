package com.raquel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raquel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
