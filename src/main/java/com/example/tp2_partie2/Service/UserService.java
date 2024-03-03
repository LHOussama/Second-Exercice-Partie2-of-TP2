package com.example.tp2_partie2.Service;

import com.example.tp2_partie2.entities.Role;
import com.example.tp2_partie2.entities.User;

public interface UserService {
    User addUser(User user);
    Role addNewRole(Role role);
    User findUserByName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}
