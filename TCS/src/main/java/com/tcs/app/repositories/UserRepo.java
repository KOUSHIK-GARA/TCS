package com.tcs.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.app.entities.User;

public interface UserRepo extends JpaRepository<User, String> {

}
