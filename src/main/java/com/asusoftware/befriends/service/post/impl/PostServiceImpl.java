package com.asusoftware.befriends.service.post.impl;

import com.asusoftware.befriends.model.dto.post.CreatePostDto;
import com.asusoftware.befriends.model.dto.post.PostDto;
import com.asusoftware.befriends.service.post.PostCreator;
import com.asusoftware.befriends.service.post.PostFinder;
import com.asusoftware.befriends.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostCreator postCreator;
    private final PostFinder postFinder;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
        postCreator.create(id, createPostDto);
    }

    @Override
    public PostDto findPostById(UUID id) {
        return PostDto.toDto(postFinder.findPostById(id));
    }

    @Override
    public List<PostDto> findAllPosts() {
        return postFinder.findAllPosts().stream().map(PostDto::toDto).collect(Collectors.toList());
    }
}
