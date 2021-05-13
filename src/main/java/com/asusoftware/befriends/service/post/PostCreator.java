package com.asusoftware.befriends.service.post;

import com.asusoftware.befriends.model.dto.post.CreatePostDto;

import java.util.UUID;

public interface PostCreator {
    void create(UUID id, CreatePostDto createPostDto);
}
