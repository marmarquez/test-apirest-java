package com.apirestdemo.test.controllers;

import com.apirestdemo.test.models.UserModel;
import com.apirestdemo.test.repositories.NamesOnly;
import com.apirestdemo.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUSer(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id){
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request,@PathVariable Long id){
        return this.userService.updateById(request,id);
    }

    @DeleteMapping(path="/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteById(id);
        if (ok){
            return "User deleted successful";
        }
        else {
            return "Error";
        }
    }
    @GetMapping(path="/nombres")
    public ArrayList<NamesOnly> getUsersNombres(){
        return this.userService.getNombres();
    }
}
