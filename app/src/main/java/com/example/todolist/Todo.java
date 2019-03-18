package com.example.todolist;

public class Todo {
    //attributs
    private String description;
    private String date;
    //constructeur
    public Todo(String description, String date) {
        this.description = description;
        this.date = date;
    }
    //getters
    public String getDescription() {
        return this.description;
    }
    public String getDate() {
        return this.date;
    }
    //setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDate(String date) {
        this.date = date;
    }

}
