package com.tcs.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.app.entities.User;

public interface UserRepo extends JpaRepository<User, String> {
	Optional<User> findByUsername(String username);
}
