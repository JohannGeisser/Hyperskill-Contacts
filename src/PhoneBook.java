import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

    private ArrayList<Contact> records = new ArrayList<Contact>();
    Scanner scanner = new Scanner(System.in);


    public void addRecord(Contact contact) {
        records.add(contact);
    }

    public int countRecords() {
        return records.size();
    }

    public void displayRecords() {
        for (int i = 0; i < records.size(); i++) {
            System.out.println(i + 1 + ". " + records.get(i).info());
        }
    }

    public void displaySpecificInfo(int record) {
        System.out.println(records.get(record));
    }

    public void removeRecords(int index) {
        records.remove(index);
        System.out.println("The record removed!");
    }

    public void editRecord(int index) {
        System.out.println("Select a field (name, surname, number):");
        String field = scanner.next();
        switch (field) {
            case "name":
                System.out.println("Enter the name:");
                String newName = scanner.next();
                records.get(index).setName(newName);
                System.out.println("The record updated!");
                break;
            case "surname":
                System.out.println("Enter the surname:");
                String newSurname = scanner.next();
                //records.get(index).setSurname(newSurname);
                System.out.println("The record updated!");
                break;
            case "number":
                System.out.println("Enter the number:");
                String newNumber = scanner.next();
                records.get(index).setPhoneNumber(newNumber);
                System.out.println("The record updated!");
                break;
            default:
                System.out.println("No valid option");
        }
    }

}
