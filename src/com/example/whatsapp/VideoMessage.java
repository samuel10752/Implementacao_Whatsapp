package com.example.whatsapp;

public class VideoMessage extends Message {
    private Media video;

    public VideoMessage(Contact sender, Media video) {
        super(sender);
        this.video = video;
    }

    public Media getVideo() {
        return video;
    }

    @Override
    public void send() {
        System.out.printf("[%s] %s enviou um vídeo (%d bytes)%n",
                getTimestamp(), sender.getName(), video.getData().length);
    }
}