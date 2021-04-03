package com.capg.tms.service;

import com.capg.tms.entities.User;
import com.capg.tms.model.UserDTO;

public interface IUserService

{
public  UserDTO addNewUser(User user);
public UserDTO signIn(User user);
public UserDTO signOut(User user);

}
