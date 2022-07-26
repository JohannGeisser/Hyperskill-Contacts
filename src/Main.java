import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        //Probablemente sea bueno crear una clase PhoneBook que me guarde la lista de los objetos de la clase Contact, en vez de crear la lista en la clase main
        //ArrayList<Contact> records = new ArrayList<Contact>();
        PhoneBook phoneBook = new PhoneBook();

        do {
            System.out.println("Enter action (add, remove, edit, count, list, exit):");
            String action = scanner.next();
            switch (action) {
                case "add":
                    System.out.println("Enter the name:");
                    String name = scanner.next();
                    System.out.println("Enter the surname:");
                    String surname = scanner.next();
                    System.out.println("Enter the number:");
                    String phoneNumber = scanner.next();
                    System.out.println("The record added.");
                    phoneBook.addRecord(new Contact(name, surname, phoneNumber));
//                    Contact contact = new Contact(name, surname, phoneNumber);
//                    phoneBook.addRecord(contact); ***** Otra forma de ingresar los datos
                    break;
//                case "remove":
//                    if (records.size() == 0) {
//                        System.out.println("No records to remove!");
//                    } else {
//                        for (int i = 0; i < records.size(); i++) { //Al mostrar la lista aquí por medio de la misma implementación que en list, me estoy repitiendo, por lo que esta sección se puede optimizar
//                            System.out.println(i + 1 + ". " + records.get(i));
//                        }
//                        System.out.println("Select a record:");
//                        int recordToRemove = scanner.nextInt();
//                        records.remove(recordToRemove - 1);
//                        System.out.println("The record removed!");
//                    }
//                    break;
//                case "edit":
//                    if (records.size() == 0) {
//                        System.out.println("No records to edit!");
//                    } else {
//                        for (int i = 0; i < records.size(); i++) { //Al mostrar la lista aquí por medio de la misma implementación que en list, me estoy repitiendo, por lo que esta sección se puede optimizar
//                            System.out.println(i + 1 + ". " + records.get(i));
//                        }
//                        System.out.println("Select a record:");
//                        int record = scanner.nextInt();
//                        System.out.println("Select a field (name, surname, number):");
//                        String field = scanner.next();
//                        switch (field) {
//                            case "name":
//                                System.out.println("Enter the name:");
//                                String newName = scanner.next();
//                                records.get(record - 1).setName(newName);
//                                System.out.println("The record updated!");
//                                break;
//                            case "surname":
//                                System.out.println("Enter the surname:");
//                                String newSurname = scanner.next();
//                                records.get(record - 1).setSurname(newSurname);
//                                System.out.println("The record updated!");
//                                break;
//                            case "number":
//                                System.out.println("Enter the number:");
//                                String newNumber = scanner.next();
//                                records.get(record - 1).setPhoneNumber(newNumber);
//                                System.out.println("The record updated!");
//                                break;
//                            default:
//                                System.out.println("No valid option");
//                        }
//                    }
//                    break;
                case "count":
                    System.out.println("The Phone Book has " + phoneBook.countRecords() + " records.");
                    break;
//                case "list":
//                    for (int i = 0; i < records.size(); i++) {
//                        System.out.println(i + 1 + ". " + records.get(i));
//                    }
//                    break;
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
