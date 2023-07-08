package com.df.userservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userDAO extends JpaRepository<User, Long> {
}

