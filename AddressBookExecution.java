import java.util.Scanner;
public class AddressBookExecution {
    public static void main(String[] args){

        AddressBook addressBook1 = new AddressBook();

        addressBook1.addContact();// to demonstrate the method to add contact
        addressBook1.changeContactDetails();// to demonstrate the method to change details of a Particular contact
        addressBook1.changeContactDetails();// to demonstrate the method to delete a Particular contact;
    }
}
