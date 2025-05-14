package com.example.whatsapp;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Contact> contacts;
    private List<Message> messages;

    public Whatsapp() {
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void sendMessage(Message message) {
        messages.add(message);
        message.send();
    }

    public List<Message> getMessages() {
        return messages;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Whatsapp app = new Whatsapp();
        Contact alice = new Contact("Alice", "+5511999990000");
        Contact bob = new Contact("Bob", "+5511988880000");
        app.addContact(alice);
        app.addContact(bob);

        TextMessage msg = new TextMessage(alice, "Olá, Bob!");
        app.sendMessage(msg);
    }
}
