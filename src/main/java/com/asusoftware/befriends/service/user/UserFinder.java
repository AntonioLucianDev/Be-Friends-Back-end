package com.asusoftware.befriends.service.user;

import com.asusoftware.befriends.model.User;

import java.util.List;
import java.util.UUID;

public interface UserFinder {
    User findUserById(UUID id);
    List<User> findAll();
}
