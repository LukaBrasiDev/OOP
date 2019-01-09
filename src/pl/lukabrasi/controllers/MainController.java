package pl.lukabrasi.controllers;

import pl.lukabrasi.models.Contact;
import pl.lukabrasi.models.services.ContactService;
import pl.lukabrasi.models.services.impl.ContactServiceImpl;
import pl.lukabrasi.views.MenuView;

import java.util.Scanner;

public class MainController {

    private MenuView menuView;
    private Scanner scanner;
    private ContactService contactService;

    public MainController() {
        menuView = new MenuView();
        scanner = new Scanner(System.in);
        contactService = new ContactServiceImpl();
    }

    public void start() {
        String answer;
        do {
            menuView.askForAnswer();
            answer = scanner.nextLine();
            parseAnswer(answer);

        } while (!answer.equals("exit"));
    }

    private void parseAnswer(String answer) {
        switch (answer) {
            case "1": {
                contactService.addContact(getContactFromUser());
                break;
            }
            case "2": {
                menuView.printContactList(contactService.getAllContacts());
                break;
            }
        }
    }

    private Contact getContactFromUser() {
        menuView.askForNumber();
        String number = scanner.nextLine();

        menuView.askForName();
        String name = scanner.nextLine();

        menuView.askForSurname();
        String surname = scanner.nextLine();

        return new Contact(name, surname, number);
    }
}
