package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanosoftz.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
