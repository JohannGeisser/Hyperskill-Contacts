import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        boolean exit = false;

        do {
            System.out.println("Enter action (add, remove, edit, count, info, exit):");
            String action = scanner.next();
            switch (action) {
                case "add":  //It would be good to evaluate a factory pattern to create new instances of a determined type of object
                    System.out.println("Enter the type (person, organization):");
                    String type = scanner.next();
                    switch (type) {
                        case "person":
                            System.out.println("Enter the name:");
                            String personName = scanner.next();
                            System.out.println("Enter the surname:");
                            String surname = scanner.next();
                            System.out.println("Enter the birth date:");
                            String birthDate = scanner.next();
                            System.out.println("Enter the gender (M, F):");
                            String gender = scanner.next();
                            System.out.println("Enter the number:");
                            String personPhoneNumber = scanner.next();
                            //phoneBook.addRecord(new Person(personName, surname, birthDate, gender, personPhoneNumber)); //Even though the array list in PB class is defined to hold Contact instances, we can still add a Person instance to it, since it inherits from the Contact class. If Person didn't extend the Contact class, this would not be possible.
                            Contact contact = new Person(personName, personPhoneNumber, surname, birthDate, gender); //With this declaration, I am defining a new Person instance, but implying that is still based on the Contact class (which is inherited from), so the list can still receive a Contact object, bus specifically instantiated for the person object.
                            phoneBook.addRecord(contact);
                            break;
                        case "organization":
                            System.out.println("Enter the organization name:");
                            String organizationName = scanner.next();
                            System.out.println("Enter the address:");
                            String address = scanner.next();
                            System.out.println("Enter the number:");
                            String organizationPhoneNumber = scanner.next();
                            phoneBook.addRecord(new Organization(organizationName, organizationPhoneNumber, address)); //This is the other way of doing it, as we can still add an Organization instance ot it, since it inherits from the Contact class.
                            break;
                        default:
                            System.out.println("Choose a valid option");
                    }
                    break;
                case "remove":
                    if (phoneBook.countRecords() == 0) {
                        System.out.println("No records to remove!");
                    } else {
                        phoneBook.displayRecords();
                        System.out.println("Select a record:");
                        int recordToRemove = scanner.nextInt() - 1;
                        phoneBook.removeRecords(recordToRemove);
                    }
                    break;
                case "edit":
                    if (phoneBook.countRecords() == 0) {
                        System.out.println("No records to edit!");
                    } else {
                        phoneBook.displayRecords();
                        System.out.println("Select a record:");
                        int record = scanner.nextInt() - 1;
                        phoneBook.editRecord(record);
                    }
                    break;
                case "count":
                    System.out.println("The Phone Book has " + phoneBook.countRecords() + " records.");
                    break;
                case "info":
                    phoneBook.displayRecords();
                    break;
                case "exit":
                    System.out.println("Exiting");
                    exit = true;
                    break;
                default:
                    System.out.println("Choose a valid option");
            }
        } while (!exit);
        
    }

}
