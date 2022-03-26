package com.company;

public class User {
    private String login;
    private String passwd;

    public User(String login,String passwd){
        this.login=login;
        this.passwd=passwd;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
