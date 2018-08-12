package com.h8.todoapp;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String... args) {
        if (System.console() != null) {
            Injector injector = Guice.createInjector();
            TodoEntryController controller = injector.getInstance(TodoEntryController.class);
            while (controller.readCommand());
        } else {
            System.out.println("Application requires console. Bye!");
        }
        System.exit(0);
    }

}
