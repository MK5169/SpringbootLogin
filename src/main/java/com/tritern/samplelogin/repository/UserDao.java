package com.tritern.samplelogin.repository;

import com.tritern.samplelogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User findByEmail(String email);
}
