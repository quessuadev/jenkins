package com.jenkinsdemo.jenkins;

public class Message {

    public String name;
    public String email;
    public int id;

    public Message() {
    }

    public Message(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Message)) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(name, message.name) && Objects.equals(email, message.email) && id == message.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, id);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", email='" + getEmail() + "'" + ", id='" + getId() + "'" + "}";
    }

}