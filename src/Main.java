import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Enter action (add, remove, edit, count, list, exit):");
            String action = scanner.next();
            switch (action) {
                case "add":
                    System.out.println("Adding");
                    break;
                case "remove":
                    System.out.println("Removing");
                    break;
                case "edit":
                    System.out.println("Editing");
                    break;
                case "count":
                    System.out.println("Counting");
                    break;
                case "list":
                    System.out.println("Listing");
                    break;
                case "exit":
                    System.out.println("Exiting");
                    exit = true;
                    break;
                default:
                    System.out.println("Choose a valid option");
            }
        } while (exit == false);





//        System.out.println("Enter the name of the person:");
//        String name = scanner.next();
//        System.out.println("Enter the surname of the person:");
//        String surname = scanner.next();
//        System.out.println("Enter the number:");
//        String phoneNumber = scanner.next();
//
//        Contact contact = new Contact(name, surname, phoneNumber);
//        System.out.println("A record created!\n" + "A Phone Book with a single record created!");
    }

}
