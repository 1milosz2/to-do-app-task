package com.h8.todoapp;

public class Main {

    private static TodoEntryController controller;

    public static void main(String... args) {
        if (System.console() != null) {
            TodoEntryRepository repository = new TodoEntryRepository();
            TodoEntryService service = new TodoEntryService(repository);
            controller = new TodoEntryController(service);
            while (controller.readCommand());
        } else {
            System.out.println("Application requires console. Bye!");
        }
        System.exit(0);
    }

}
