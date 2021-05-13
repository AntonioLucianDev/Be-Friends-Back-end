package com.asusoftware.befriends.controller;

import com.asusoftware.befriends.model.dto.post.CreatePostDto;
import com.asusoftware.befriends.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping(path = "/create/{id}")
    public void create(@PathVariable(name = "id") UUID id, @Valid @RequestBody CreatePostDto createPostDto) {
        postService.create(id, createPostDto);
    }
}
