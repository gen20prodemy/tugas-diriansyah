package com.prodemy.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodemy.springbootjpa.entity.UserApp;
import java.util.Optional;


public interface UserRepos extends JpaRepository<UserApp, Long>{
    Optional<UserApp> findByUsername(String username);
}
