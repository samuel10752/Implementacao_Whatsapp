package com.example.whatsapp;

public class AudioMessage extends Message {
    private Media audio;

    public AudioMessage(Contact sender, Media audio) {
        super(sender);
        this.audio = audio;
    }

    public Media getAudio() {
        return audio;
    }

    @Override
    public void send() {
        System.out.printf("[%s] %s enviou um áudio (%d bytes)%n",
                getTimestamp(), sender.getName(), audio.getData().length);
    }
}