import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contactList;
    PhoneBook(){
        contactList = new ArrayList<>();
    }
    public boolean addContact(Contact contact){
        if (contactList.contains(contact)){
            return false;
        }
        else {
            contactList.add(contact);
            System.out.println("Contact added.");
            return true;
        }
    }

    public boolean deleteContact(String firstName, String lastName){
        for (Contact contact : contactList) {
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
                contactList.remove(contact);
                return true;
            }
        }
        return false;
    }

    public Contact findContact(String firstName, String lastName){
        for (Contact contact : contactList){
            if (contact.getLastName().equals(firstName) && contact.getLastName().equals(lastName)){
                return contact;
            }
        }
        System.out.println("Contact not found.");
        return null;
    }

    private int calculateGroupContacts(String group){
        int count = 0;
        for (Contact contact : contactList){
            if (contact.getGroup().equals(group)){
                count ++;
            }
        }
        return count;
    }

    public Contact[] findContacts(String group){
        Contact[] contacts = new Contact[calculateGroupContacts(group)];
        int i = 0;
        for (Contact contact : contactList){
            if (contact.getGroup().equals(group)){
                contacts[i] = contact;
                i ++;
            }
        }
        if (contacts.length == 0) System.out.println("The group has no contacts.");
        return contacts;
    }

    public void printContacts(Contact[] contactList){
        for (Contact contact : contactList){
            System.out.println(contact.toString());
        }
    }
    public void printContacts(){
        for (Contact contact : contactList){
            System.out.println(contact.toString());
        }
    }
}
