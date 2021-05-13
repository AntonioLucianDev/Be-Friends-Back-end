package com.asusoftware.befriends.service.post;

import com.asusoftware.befriends.model.Post;

import java.util.List;
import java.util.UUID;

public interface PostFinder {
    Post findPostById(UUID id);
    List<Post> findAllPosts();
}
