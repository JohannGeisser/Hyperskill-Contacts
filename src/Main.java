import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        ContactFactory contactFactory = new ContactFactory();
        boolean exit = false;

        do {
            System.out.println("Enter action (add, remove, edit, count, info, exit):");
            String action = scanner.next();
            switch (action) {
                case "add":
                    System.out.println("Enter the type (person, organization):");
                    String type = scanner.next();
                    phoneBook.addRecord(contactFactory.newInstance(type));
                    System.out.println("The record added.");
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
                    System.out.println("Select a record:");
                    int recordDisplay = scanner.nextInt() - 1;
                    phoneBook.displaySpecificInfo(recordDisplay);
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
