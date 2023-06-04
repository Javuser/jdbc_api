package com.nurbakyt.jdbc;

import java.util.List;
import java.util.Objects;

public class User {
    private long id;
    private String login;
    private String password;
    private List<Chatroom> rooms;
    private List<Chatroom> chattingRooms;

    public User(long id, String login, String password, List<Chatroom> rooms, List<Chatroom> chattingRooms) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.rooms = rooms;
        this.chattingRooms = chattingRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(rooms, user.rooms) && Objects.equals(chattingRooms, user.chattingRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, rooms, chattingRooms);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", rooms=" + rooms +
                ", chattingRooms=" + chattingRooms +
                '}';
    }
}
