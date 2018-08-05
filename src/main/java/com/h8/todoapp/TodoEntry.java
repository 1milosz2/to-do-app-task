package com.h8.todoapp;

public class TodoEntry {

    private final String subject;

    private final String dueDate;

    public TodoEntry(String subject, String dueDate) {
        this.subject = subject;
        this.dueDate = dueDate;
    }

    public String getSubject() {
        return subject;
    }

    public String getDueDate() {
        return dueDate;
    }

}
