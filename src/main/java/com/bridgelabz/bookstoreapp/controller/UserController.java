/* UserController.java */
package com.bridgelabz.bookstoreapp.controller;

import com.bridgelabz.bookstoreapp.dto.ResponseDTO;
import com.bridgelabz.bookstoreapp.dto.UserDTO;
import com.bridgelabz.bookstoreapp.entity.UserData;
import com.bridgelabz.bookstoreapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @author ROSHNI MALI
 * @version 0.0.1-SNAPSHOT
 * @since 18 September 2021
 * */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public ResponseEntity<ResponseDTO> getUser(){
        List<UserData> userDataList = null;
        userDataList = userService.getUser();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", userDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<ResponseDTO> getUserById(@PathVariable int id){
        UserData userData = null;
        userData = userService.getUserById(id);
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful By ID", userData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/createUser")
    public ResponseEntity<ResponseDTO> createUser(@RequestBody UserDTO userDTO) {
        UserData userData = null;
        userData = userService.createUser(userDTO);
        ResponseDTO respDTO = new ResponseDTO("Create User Successfully", userData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<ResponseDTO> updateUser(@PathVariable int id, @RequestBody UserDTO userDTO) {
        UserData userData = null;
        userData = userService.updateUser(id, userDTO);
        ResponseDTO respDTO = new ResponseDTO("User Updated Successfully", userData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<ResponseDTO> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: "+id);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

}
