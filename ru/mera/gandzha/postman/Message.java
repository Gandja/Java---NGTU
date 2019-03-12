package ru.mera.gandzha.postman;

public class Message {
    String from;
    String to;
    String message_body;
    public static void main(String[] args) {
        Email email = new Email();
        email.from = "Hello";
    }
}

class Email {
    String from;
    String to;
    String message_body;
    String recieve_date;
}
 class Letter {
     String from;
     String to;
     String message_body;
     String fromPostalIndex;
     String toPostalIndex;
 }