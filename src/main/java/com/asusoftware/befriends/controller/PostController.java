package com.asusoftware.befriends.controller;

import com.asusoftware.befriends.model.dto.post.CreatePostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    @PostMapping(path = "/create/{id}")
    public void create(@PathVariable(name = "id") @Valid @RequestBody CreatePostDto createPostDto) {}
}
