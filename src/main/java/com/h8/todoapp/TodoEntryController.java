package com.h8.todoapp;

public class TodoEntryController {

     private TodoEntryService service;

    public TodoEntryController(TodoEntryService service) {
        this.service = service;
    }

    public boolean readCommand() {
        System.out.println("What do you want do do?");
        System.out.println("* LIST");
        System.out.println("* ADD <subject> <dueDate>");
        System.out.println("* EXIT");
        String command = System.console().readLine();
        return interpretCommand(command);
    }

    private boolean interpretCommand(String input) {
        String[] sections = input.split(" ");
        String command = sections[0];
        switch (command) {
            case "LIST":
                service.listAllEtries()
                        .forEach(e -> System.out.println(
                                "- " + e.getSubject() + " due: " + e.getDueDate()));
                return true;
            case "ADD":
                if (sections.length == 3) {
                    String subject = sections[1];
                    String dueDate = sections[2];
                    service.addEntry(new TodoEntry(subject, dueDate));
                    System.out.println("New task added! So cool!");
                } else {
                    System.out.println("Invalid usage of ADD command");
                }
                return true;
            case "EXIT":
                System.out.println("Bye!");
                return false;
            default:
                System.out.println("Unknown command");
                return true;
        }
    }

}
