package org.example.finalproject.repository;

import org.example.finalproject.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login,String> {
    Optional<Login>findByUsername(String username);
    Optional<Login>findByPassword(String password);
    boolean existsByUsername(String username);
    Optional<Login> findByUserUserId(Integer userId);
}
