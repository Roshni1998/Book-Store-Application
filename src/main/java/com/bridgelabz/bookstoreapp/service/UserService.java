/* UserService Class */
package com.bridgelabz.bookstoreapp.service;

import com.bridgelabz.bookstoreapp.dto.UserDTO;
import com.bridgelabz.bookstoreapp.entity.UserData;
import com.bridgelabz.bookstoreapp.repository.IUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    public List<UserData> getUser(){
        return userRepository.findAll();
    }

    public UserData getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public UserData createUser(UserDTO userDTO){
        UserData data = null;
        data = new UserData(userDTO);
        log.debug("User Data : "+data.toString());
        return userRepository.save(data);
    }

    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "User deleted Successfully !!" +id;
    }

    public UserData updateUser(int id, UserDTO userDTO){
        UserData data = this.getUserById(id);
        data.updateUser(userDTO);
        return userRepository.save(data);
    }
}
