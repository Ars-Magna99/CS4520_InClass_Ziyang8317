/*
 * CS4520 InClass08
 * Name: Ziyang Wang
 * Date: 2023-03-27
 * */

package com.example.cs4520_inclass_ziyang8317.Packages;

public class Chat {
    private String sender;
    private String receiver;
    private String message;
    private boolean isseen;

    private String image_message;

    public Chat(String sender, String receiver, String message, boolean isseen,String image_message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen = isseen;
        this.image_message = image_message;
    }

    public Chat(String sender, String receiver, String message, boolean isseen) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen = isseen;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }

    public String getImage_message() {
        return image_message;
    }

    public void setImage_message(String image_message) {
        this.image_message = image_message;
    }
}
