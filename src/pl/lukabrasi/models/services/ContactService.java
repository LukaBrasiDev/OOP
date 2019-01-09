package pl.lukabrasi.models.services;

import pl.lukabrasi.models.Contact;

import java.util.List;

public interface ContactService {

    void addContact(Contact contact);

    List<Contact> getAllContacts();

}
