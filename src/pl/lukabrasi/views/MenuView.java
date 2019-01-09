package pl.lukabrasi.views;

import pl.lukabrasi.models.Contact;

import java.util.List;

public class MenuView {

    public void printMenu() {
        System.out.println("1 - Dodaj kontakt");
        System.out.println("2 - Wyświetl wszystkie kontakty");
        System.out.println("exit - Wyjście");
    }

    public void askForAnswer() {
        System.out.println("Podaj odpowiedź: ");
    }

    public void askForNumber() {
        System.out.println("Podaj numer: ");
    }

    public void askForName() {
        System.out.println("Podaj imię: ");
    }

    public void askForSurname() {
        System.out.println("Podaj nazwisko: ");
    }

    public void printContactList(List<Contact> contactList) {
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getNumber());
        }
    }
}
