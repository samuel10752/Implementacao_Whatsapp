package com.example.whatsapp;

public class ImageMessage extends Message {
    private Media image;

    public ImageMessage(Contact sender, Media image) {
        super(sender);
        this.image = image;
    }

    public Media getImage() {
        return image;
    }

    @Override
    public void send() {
        System.out.printf("[%s] %s enviou uma imagem (%d bytes)%n",
                getTimestamp(), sender.getName(), image.getData().length);
    }
}