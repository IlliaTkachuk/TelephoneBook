package telephonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TelephoneBook {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact getContact(String phoneNumber) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact currentContact = iterator.next();
            if (phoneNumber.equals(currentContact.getPhoneNumber())) {
                return currentContact;
        }
    }
        return null;
    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }

    public void update(Contact contact) {
        Iterator<Contact> iterator = contacts.iterator();
        Contact existingContact = null;

        while (iterator.hasNext()) {
            Contact currentContact = iterator.next();
            if (currentContact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                existingContact = currentContact;
                break;
            }
            if (existingContact == null) {
                System.out.println("No such contact found!");
            } else {
                existingContact.setFirstName(contact.getFirstName());
                existingContact.setLastName(contact.getLastName());
            }
        }
    }

    public void remove(Contact contact) {
        contacts.remove(contact);
    }
}
