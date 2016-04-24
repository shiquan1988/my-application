package com.webapp.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}