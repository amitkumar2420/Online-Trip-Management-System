package com.capg.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.tms.entities.User;

public interface IUserRepository extends JpaRepository<User,Integer>{

}
