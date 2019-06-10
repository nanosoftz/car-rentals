package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanosoftz.entity.CarTypes;

@Repository
public interface CarTypeRepository extends JpaRepository<CarTypes, Long>{

}
