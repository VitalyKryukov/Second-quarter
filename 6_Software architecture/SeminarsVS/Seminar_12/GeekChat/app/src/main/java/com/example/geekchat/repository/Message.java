package com.example.geekchat.repository;

import java.util.Date;

public class Message {
    public String from;
    public String to;
    public String text;
    public long time;

    public Message(String from, String to, String text, long time) {
        this.from = from;
        this.to = to;
        this.text = text;
        this.time = time;
    }
}
