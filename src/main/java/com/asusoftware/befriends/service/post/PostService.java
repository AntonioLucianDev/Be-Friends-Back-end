package com.asusoftware.befriends.service.post;

import com.asusoftware.befriends.model.dto.post.CreatePostDto;
import com.asusoftware.befriends.model.dto.post.PostDto;

import java.util.List;
import java.util.UUID;

public interface PostService {
    void create(UUID id, CreatePostDto createPostDto);
    PostDto findPostById(UUID id);
    List<PostDto> findAllPosts();
}
