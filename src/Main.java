import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        boolean exit = false;

        do {
            System.out.println("Enter action (add, remove, edit, count, list, exit):");
            String action = scanner.next();
            switch (action) {
                case "add":
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

                            break;
                        case "organization":
                            System.out.println("Enter the organization name:");
                            String organizationName = scanner.next();
                            System.out.println("Enter the address:");
                            String address = scanner.next();
                            System.out.println("Enter the number:");
                            String organizationPhoneNumber = scanner.next();

                            break;
                        default:
                            System.out.println("Choose a valid option");
                    }




//                    System.out.println("Enter the name:");
//                    String name = scanner.next();
//                    System.out.println("Enter the surname:");
//                    String surname = scanner.next();
//                    System.out.println("Enter the number:");
//                    String phoneNumber = scanner.next();
//                    //phoneBook.addRecord(new Contact(name, surname, phoneNumber));
//                    System.out.println("The record added.");
//                    /*Contact contact = new Contact(name, surname, phoneNumber);
//                    phoneBook.addRecord(contact); ***** Otra forma de ingresar los datos*/
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
                case "list":
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
