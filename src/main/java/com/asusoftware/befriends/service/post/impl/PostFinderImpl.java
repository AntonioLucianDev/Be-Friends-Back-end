package com.asusoftware.befriends.service.post.impl;

import com.asusoftware.befriends.exception.PostNotFoundException;
import com.asusoftware.befriends.model.Post;
import com.asusoftware.befriends.repository.PostRepository;
import com.asusoftware.befriends.service.post.PostFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostFinderImpl implements PostFinder {

    private final PostRepository postRepository;

    @Override
    public Post findPostById(UUID id) {
        return postRepository.findById(id).orElseThrow(PostNotFoundException::new);
    }

    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
}
