package com.asusoftware.befriends.service.user;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.model.dto.user.UserDto;

import java.util.UUID;

public interface UserService {
    void create(CreateUserDto createUserDto);
    UserDto findUserById(UUID id);
}
