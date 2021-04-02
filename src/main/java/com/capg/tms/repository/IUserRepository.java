package com.capg.tms.repository;

import com.capg.tms.entities.User;

public interface IUserRepository {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
