import java.util.Scanner;
public class AddressBook {

    Person person[] = new Person[100];
    int index = 1;
    Scanner scanner = new Scanner(System.in);

    public void addContact(){

        System.out.println("Enter the following details of the new contact");
        System.out.println("First Name :");
        String firstName = scanner.next();
        System.out.println("Second Name :");
        String lastName = scanner.next();
        System.out.println("Address :");
        String new_Address = scanner.next();
        System.out.println("City :");
        String new_City = scanner.next();
        System.out.println("State :");
        String new_State = scanner.next();
        System.out.println("Zip :");
        String new_Zip = scanner.next();
        System.out.println("Phone Number :");
        String new_Phone_Number = scanner.next();
        System.out.println("Email :");
        String new_Email = scanner.next();

        person[index-1] = new Person(firstName, lastName, new_Address, new_City, new_State,  new_Zip,
                                   new_Phone_Number, new_Email);
        index++;
    }

}
