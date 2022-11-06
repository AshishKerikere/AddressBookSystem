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

    public void changeContactDetails(){

        System.out.println("Enter the First Name");
        String searchFirstName = scanner.next();
        System.out.println("Enter the Last Name");
        String searchLastName = scanner.next();

        int location = 0;
        boolean search = false;

        for (int i = 0; i < 100; i++){
            if (person[i].first_Name.equals(searchFirstName) && person[i].last_Name.equals(searchLastName)){
             location = i;
             search = true;
             break;
            }
        }

       if (search){

           int toCheck = 1;
           while(toCheck == 1){
               int select = 0;

               System.out.println("Enter 1 to change First Name, 2 to change Second Name," );
               System.out.println("Enter 3 to change Address, 4 to change City," );
               System.out.println("Enter 5 to State, 6 to change Zip," );
               System.out.println("Enter 7 to change Phone Number, 8 to change Email." );

               select = scanner.nextInt();
               System.out.println("Enter the detail to be changed");

               switch (select){
                   case 1 : person[location].first_Name = scanner.next();
                            break;
                   case 2 : person[location].last_Name = scanner.next();
                            break;
                   case 3 : person[location].address = scanner.next();
                            break;
                   case 4 : person[location].city = scanner.next();
                            break;
                   case 5 : person[location].state = scanner.next();
                            break;
                   case 6 : person[location].zip = scanner.next();
                            break;
                   case 7 : person[location].phone_Number = scanner.next();
                            break;
                   case 8 : person[location].email = scanner.next();
                            break;
               }
               System.out.println("If done with changes press 0 else press 1");
               toCheck = scanner.nextInt();
           }
       }
       else {
           System.out.println("Name not found try again");
       }
    }

    public void deleteContact(){
        System.out.println("Enter the First Name");
        String searchFirstName = scanner.next();
        System.out.println("Enter the Last Name");
        String searchLastName = scanner.next();

        int location = 0;
        boolean search = false;

        for (int i = 0; i < 100; i++){
            if (person[i].first_Name.equals(searchFirstName) && person[i].last_Name.equals(searchLastName)){
                location = i;
                search = true;
                break;
            }
        }

        if(search){
            for(int i = location; i<(index-1); i++){
                person[i].first_Name = person[i+1].first_Name;
                person[i].last_Name = person[i+1].last_Name;
                person[i].address = person[i+1].address;
                person[i].city = person[i+1].city;
                person[i].state = person[i+1].state;
                person[i].zip = person[i+1].zip;
                person[i].phone_Number = person[i+1].phone_Number;
                person[i].email = person[i+1].email;
            }
        }
    }

}
