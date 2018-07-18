package com.h8.todoapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoEntryRepository {

    private List<TodoEntry> storage;

    public TodoEntryRepository() {
        storage = new ArrayList<>();
    }

    public void save(TodoEntry entry) {
        storage.add(entry);
    }

    public List<TodoEntry> findAll() {
        return Collections.unmodifiableList(storage);
    }

}
