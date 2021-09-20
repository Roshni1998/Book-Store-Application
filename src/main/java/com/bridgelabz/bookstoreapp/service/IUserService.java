/* UserService Interface */
package com.bridgelabz.bookstoreapp.service;

import com.bridgelabz.bookstoreapp.dto.UserDTO;
import com.bridgelabz.bookstoreapp.entity.UserData;

import java.util.List;

public interface IUserService {

    List<UserData> getUser();

    UserData getUserById(int id);

    UserData createUser(UserDTO userDTO);

    String deleteUser(int id);

    UserData updateUser(int id, UserDTO userDTO);
}
