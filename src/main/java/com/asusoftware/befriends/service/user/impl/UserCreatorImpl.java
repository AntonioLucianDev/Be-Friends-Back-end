package com.asusoftware.befriends.service.user.impl;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.repository.UserRepository;
import com.asusoftware.befriends.service.user.UserCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

    private final UserRepository userRepository;

    @Override
    public void create(CreateUserDto createUserDto) {
        userRepository.save(CreateUserDto.toEntity(createUserDto));
    }
}
