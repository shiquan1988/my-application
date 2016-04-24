package com.webapp.persist.repo;

import com.webapp.persist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {

}
