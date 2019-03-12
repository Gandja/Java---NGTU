package ru.mera.gandzha.postman;

import java.util.ArrayList;

public class MailBox {
    ArrayList <String>  emailMessage = new ArrayList<>();
    ArrayList <String> letterMessage = new ArrayList<>();

    public void addEmailMessage(){
        emailMessage.add("Привет");
    }
    public void addLetterMessage(){
        letterMessage.add("Как дела?");
    }
    public void getAllLetterMessage(){
        for(String message : emailMessage){
            System.out.println(emailMessage);
        }
    }
    public void getAllEmailMessage(){
        for(String message : letterMessage){
            System.out.println(letterMessage);
        }
    }
}
