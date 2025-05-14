package com.example.whatsapp;

public class Media {
    private byte[] data;
    private String mimeType;

    public Media(byte[] data, String mimeType) {
        this.data = data;
        this.mimeType = mimeType;
    }

    public byte[] getData() {
        return data;
    }

    public String getMimeType() {
        return mimeType;
    }
}