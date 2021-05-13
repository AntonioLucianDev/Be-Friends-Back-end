package com.asusoftware.befriends.exception;

public class UserNotFoundException extends BeFriendsException{
    public UserNotFoundException() {
        super("User not found!");
    }
}
