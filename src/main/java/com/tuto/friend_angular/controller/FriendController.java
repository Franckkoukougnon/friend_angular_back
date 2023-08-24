package com.tuto.friend_angular.controller;

import com.tuto.friend_angular.entity.Friend;
import com.tuto.friend_angular.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController{

    @Autowired
    private FriendService friendService;
    @GetMapping("/friend")
    public List<Friend> getFriendList(){
        return friendService.getFriendList();

    }

    @PostMapping("/friend/addnew")
    public void addFriend(@RequestBody Friend friend){


        friendService.addFriend(friend);
    }

    @PutMapping("/friend/{id}/edit")
    public void editFriend(@RequestBody Friend friend, @PathVariable("id") Integer id){
        friendService.updateFriend(friend);
    }

    @DeleteMapping("/friend/{id}/delete")
    public void deleteFriend(@RequestBody Friend friend, @PathVariable("id") Integer id){
        friendService.removeFriend(id);
    }



}


