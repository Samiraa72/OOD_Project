package controllers;

import models.User;

public class MailServerProvider {

    public void sendToUsers(User[] users, String msg){
        for(User user : users){
            sendMsg(user, msg);
        }
    }

    private void sendMsg(User user, String msg) {
        //sendMsg
    }
}
