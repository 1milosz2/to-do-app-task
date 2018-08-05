package com.h8.todoapp;

import java.util.List;

public class TodoEntryService {

    private TodoEntryRepository repository;

//    @Inject
    public TodoEntryService(TodoEntryRepository repository) {
        this.repository = repository;
    }


    public void addEntry(TodoEntry entry) {
        repository.save(entry);
    }

    public List<TodoEntry> listAllEtries() {
        return repository.findAll();
    }

}
