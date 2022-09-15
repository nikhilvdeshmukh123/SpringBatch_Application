package com.bridgelabz.springbatchapplication.repository;

import com.bridgelabz.springbatchapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
