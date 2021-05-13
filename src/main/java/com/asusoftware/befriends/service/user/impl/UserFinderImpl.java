package com.asusoftware.befriends.service.user.impl;

import com.asusoftware.befriends.exception.UserNotFoundException;
import com.asusoftware.befriends.model.User;
import com.asusoftware.befriends.repository.UserRepository;
import com.asusoftware.befriends.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserFinderImpl implements UserFinder {

    private final UserRepository userRepository;

    @Override
    public User findUserById(UUID id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
