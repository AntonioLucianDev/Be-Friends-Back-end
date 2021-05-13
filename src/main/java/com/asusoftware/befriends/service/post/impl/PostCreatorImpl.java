package com.asusoftware.befriends.service.post.impl;

import com.asusoftware.befriends.model.Post;
import com.asusoftware.befriends.model.User;
import com.asusoftware.befriends.model.dto.post.CreatePostDto;
import com.asusoftware.befriends.repository.PostRepository;
import com.asusoftware.befriends.service.post.PostCreator;
import com.asusoftware.befriends.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostCreatorImpl implements PostCreator {

    private final PostRepository postRepository;
    private final UserFinder userFinder;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
        User user = userFinder.findUserById(id);
        Post post = CreatePostDto.toEntity(createPostDto);
        post.setUser(user);
        postRepository.save(post);
    }
}
