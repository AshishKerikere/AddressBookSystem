import java.util.Scanner;
public class AddressBookExecution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook1 = new AddressBook();

        addressBook1.addContact();// to demonstrate the method to add contact
        addressBook1.changeContactDetails();// to demonstrate the method to change details of a Particular contact
        addressBook1.changeContactDetails();// to demonstrate the method to delete a Particular contact;

        //to demonstrate how to add multiple contacts
        System.out.println("Enter the number of Contact Details you want");
        int number_ofContacts = sc.nextInt();
        for (int i = 0; i < number_ofContacts; i++) {
            System.out.println("Start Entering the details for " + (i + 1) + "Contact");
            addressBook1.addContact();
        }
    }
}
