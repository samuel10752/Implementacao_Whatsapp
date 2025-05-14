package com.example.whatsapp;

public class TextMessage extends Message {
    private String textContent;

    public TextMessage(Contact sender, String textContent) {
        super(sender);
        this.textContent = textContent;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public void send() {
        System.out.printf("[%s] %s: %s%n",
                getTimestamp(), sender.getName(), textContent);
    }
}