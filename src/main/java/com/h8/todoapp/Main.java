package com.h8.todoapp;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    private static TodoEntryController controller;

    public static void main(String... args) {
        if (System.console() != null) {
            Injector injector = Guice.createInjector(new ToDoEntryControllerModule());
//            TodoEntryRepository repository = injector.getInstance(TodoEntryRepository.class);
            TodoEntryRepository repository = new TodoEntryRepository();
            TodoEntryService service = new TodoEntryService(repository);
            TodoEntryController controller = new TodoEntryController(service);
//            TodoEntryController controller = injector.getInstance(TodoEntryController.class);
            while (controller.readCommand());
        } else {
            System.out.println("Application requires console. Bye!");
        }
        System.exit(0);
    }

}
