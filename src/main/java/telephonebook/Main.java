package telephonebook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        Contact contact = new Contact("Illia", "Samuilovich", "+3801234567");
        Contact contact1 = new Contact("Alex", "Napoleonovich", "+3807654321");
        Contact contact2 = new Contact("Pupok", "Vasy", "+3801785265");
        Contact contact3 = new Contact("Dyadya", "Dyadi", "+1(-334)1234567");

        telephoneBook.addContact(contact);
        telephoneBook.addContact(contact1);
        telephoneBook.addContact(contact2);
        telephoneBook.addContact(contact3);

        ArrayList<Contact> allContacts = telephoneBook.getAllContacts();
        for (Contact currentContact : allContacts) {
            System.out.println(currentContact);
        }
    }
}
