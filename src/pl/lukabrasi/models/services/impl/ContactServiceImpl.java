package pl.lukabrasi.models.services.impl;

import pl.lukabrasi.models.Contact;
import pl.lukabrasi.models.services.ContactService;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {

    private List<Contact> contacts = new ArrayList<>(); //baza danych

    @Override
    public void addContact(Contact contact) {
        if (isSurnameExists(contact.getSurname())) {
            return;
        }
        contacts.add(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }

    private boolean isSurnameExists(String surname) {
        for (Contact contact : contacts) {
            if (contact.getSurname().equals(surname)) {
                return true;
            }
        }
        return false;
    }
}
