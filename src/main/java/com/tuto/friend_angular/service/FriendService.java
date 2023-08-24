package com.tuto.friend_angular.service;

import com.tuto.friend_angular.entity.Friend;
import com.tuto.friend_angular.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendRepository friendRepository;
    public List<Friend> getFriendList() {
        return friendRepository.findAll();


    }

    public void addFriend(Friend friend) {
        friendRepository.save(friend);

    }

    public void  removeFriend(Integer id) {
        friendRepository.deleteById(id);

    }

    public void updateFriend(Friend friend){
        friendRepository.save(friend);

    }
}
