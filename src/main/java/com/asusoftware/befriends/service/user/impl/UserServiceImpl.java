package com.asusoftware.befriends.service.user.impl;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.service.user.UserCreator;
import com.asusoftware.befriends.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserCreator userCreator;

    @Override
    public void create(CreateUserDto createUserDto) {
        userCreator.create(createUserDto);
    }
}
