package com.capg.tms.service;

import com.capg.tms.entities.User;

public interface IUserService {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
