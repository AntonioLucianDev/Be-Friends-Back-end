package com.asusoftware.befriends.exception;

public class PostNotFoundException extends BeFriendsException {
    public PostNotFoundException() {
        super("Post not found!");
    }
}
