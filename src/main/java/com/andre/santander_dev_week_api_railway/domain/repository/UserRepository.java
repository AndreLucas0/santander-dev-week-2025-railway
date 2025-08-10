package com.andre.santander_dev_week_api_railway.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andre.santander_dev_week_api_railway.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
