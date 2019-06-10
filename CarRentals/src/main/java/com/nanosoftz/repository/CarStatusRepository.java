package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanosoftz.entity.CarStatus;

@Repository
public interface CarStatusRepository extends JpaRepository<CarStatus, Boolean>{

}
