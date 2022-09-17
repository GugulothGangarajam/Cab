package com.balu.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balu.Entity.CabCustomer;

public interface CabRepo extends JpaRepository<CabCustomer,Long> {

}
