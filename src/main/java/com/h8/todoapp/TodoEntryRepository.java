package com.h8.todoapp;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoEntryRepository {

    private List<TodoEntry> storage;

    @Inject
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
