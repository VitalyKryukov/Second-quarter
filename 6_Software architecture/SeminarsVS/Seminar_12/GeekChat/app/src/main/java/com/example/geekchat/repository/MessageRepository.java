package com.example.geekchat.repository;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
    private static MessageRepository messageRepository = null;
    final private ArrayList<Message> messages;

    private MessageRepository() {
        messages = new ArrayList<>();
    }

    public static MessageRepository getMessageRepository() {
        if(messageRepository == null){
            messageRepository = new MessageRepository();
        }
        return messageRepository;
    }

    public ArrayList<Message> getMessages(){
        return messages;
    }


}
