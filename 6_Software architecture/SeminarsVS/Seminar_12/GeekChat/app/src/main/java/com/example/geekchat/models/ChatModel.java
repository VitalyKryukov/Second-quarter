package com.example.geekchat.models;

import com.example.geekchat.repository.Message;
import com.example.geekchat.repository.MessageRepository;
import com.example.geekchat.repository.User;
import com.example.geekchat.repository.UserRepository;

import java.util.ArrayList;

public class ChatModel {
    public ArrayList<Message> getMessages() {
        return MessageRepository.getMessageRepository().getMessages();
    }

    public ArrayList<User> getUsers() {
        return UserRepository.getUserRepository().getUsers();
    }

    public boolean login(User user) {
        if (checkUser(user)) {
            UserRepository.getUserRepository().setLoggedUser(user);
            return true;
        }
        return false;
    }

    public User getLoggedUser() {
        return UserRepository.getUserRepository().getLoggedUser();
    }

    private boolean checkUser(User user) {
        if(user.name.equals("user") && user.password.equals("password")) {
            return true;
        }
        return false;
    }

}

