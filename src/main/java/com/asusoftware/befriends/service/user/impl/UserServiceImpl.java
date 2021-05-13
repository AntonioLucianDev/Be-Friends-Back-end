package com.asusoftware.befriends.service.user.impl;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.model.dto.user.UserDto;
import com.asusoftware.befriends.service.user.UserCreator;
import com.asusoftware.befriends.service.user.UserFinder;
import com.asusoftware.befriends.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserCreator userCreator;
    private final UserFinder userFinder;

    @Override
    public void create(CreateUserDto createUserDto) {
        userCreator.create(createUserDto);
    }

    @Override
    public UserDto findUserById(UUID id) {
        return UserDto.toDto(userFinder.findUserById(id));
    }
}
