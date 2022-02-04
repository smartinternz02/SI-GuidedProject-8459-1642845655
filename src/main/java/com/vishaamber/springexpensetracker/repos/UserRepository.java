package com.vishaamber.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishaamber.springexpensetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findFirstByUsername(String username);
}
