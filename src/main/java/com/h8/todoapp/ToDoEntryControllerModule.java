package com.h8.todoapp;

import com.google.inject.AbstractModule;

public class ToDoEntryControllerModule extends AbstractModule {
    @Override
    protected void configure() {
bind(TodoEntryRepository.class).toInstance(new TodoEntryRepository());
//bind(TodoEntryService.class).toInstance(new TodoEntryService(new TodoEntryRepository()));

    }

//    @Provides
//    TodoEntryController provideController () {
//        TodoEntryController controller = new TodoEntryController(new TodoEntryService(new TodoEntryRepository()));
//        return controller;
//    }
}
