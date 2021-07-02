package com.jason.LogRecordDemo.controller;

import com.jason.LogRecordDemo.modal.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author Jason
 * @Date 2021-07-02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    Map<Long, User> userMap = new HashMap<>();

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userMap.get(id);
    }

    @DeleteMapping("/delete")
    public Long deleteUser(@RequestParam("id") Long id){
        userMap.remove(id);
        return id;
    }

    @PostMapping("/save")
    public Long saveUser(User user){
        Long id = ThreadLocalRandom.current().nextLong(1, 1000);
        userMap.put(id, user);
        return id;
    }

    @PutMapping("/update")
    public Long updateUser(@RequestBody User user){
        userMap.put(user.getId(), user);
        return user.getId();
    }

    @GetMapping("exception")
    public String exceptionMethod(){
        int i = 1/0;
        return "ok";
    }

}
