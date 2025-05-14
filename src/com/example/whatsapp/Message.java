package com.example.whatsapp;

import java.time.LocalDateTime;

public abstract class Message {
    protected Contact sender;
    protected LocalDateTime timestamp;

    public Message(Contact sender) {
        this.sender = sender;
        this.timestamp = LocalDateTime.now();
    }

    public Contact getSender() {
        return sender;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public abstract void send();
}