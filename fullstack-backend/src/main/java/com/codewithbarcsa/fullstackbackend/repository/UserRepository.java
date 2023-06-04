package com.codewithbarcsa.fullstackbackend.repository;

import com.codewithbarcsa.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
