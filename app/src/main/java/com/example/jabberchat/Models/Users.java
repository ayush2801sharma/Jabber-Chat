package com.example.jabberchat.Models;

public class Users {
    String profilepic, uerName, mail, password, userId, lastMessage,status;

    public Users(String profilepic, String uerName, String mail, String password, String userId, String lastMessage) {
        this.profilepic = profilepic;
        this.uerName = uerName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }
    public Users(){}
    //SignUp Constructor
    public Users( String uerName, String mail, String password) {

        this.uerName = uerName;
        this.mail = mail;
        this.password = password;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return uerName;
    }

    public void setUserName(String uerName) {
        this.uerName = uerName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
