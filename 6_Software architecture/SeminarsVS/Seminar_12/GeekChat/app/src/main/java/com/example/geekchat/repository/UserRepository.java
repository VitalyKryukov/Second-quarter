package com.example.geekchat.repository;

import java.util.ArrayList;

public class UserRepository {
    private User loggedUser;

    private static UserRepository userRepository = null;
    final private ArrayList<User> users;

    private UserRepository() {
        users = new ArrayList<>();
    }

    public static UserRepository getUserRepository() {
        if(userRepository == null){
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User user) {
        this.loggedUser = user;
    }
}
