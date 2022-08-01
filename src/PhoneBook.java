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

        if (records.get(index) instanceof Person) {
            System.out.println("Select a field (name, surname, birth, gender, number):");
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
                    ((Person) records.get(index)).setSurname(newSurname);
                    System.out.println("The record updated!");
                    break;
                case "birth":
                    System.out.println("Enter the birth date:");
                    String newBirthDate = scanner.next();
                    ((Person) records.get(index)).setBirthDate(newBirthDate);
                    System.out.println("The record updated!");
                    break;
                case "gender":
                    System.out.println("Enter the gender (M, F):");
                    String newGender = scanner.next();
                    ((Person) records.get(index)).setGender(newGender);
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
        } else {

            System.out.println("Select a field (address, number):");
            String field = scanner.next();
            switch (field) {
                case "address":
                    System.out.println("Enter address:");
                    String newAddress = scanner.next();
                    ((Organization) records.get(index)).setAddress(newAddress);
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



//        System.out.println("Select a field (name, surname, number):");
//        String field = scanner.next();
//        switch (field) {
//            case "name":
//                System.out.println("Enter the name:");
//                String newName = scanner.next();
//                records.get(index).setName(newName);
//                System.out.println("The record updated!");
//                break;
//            case "surname":
//                System.out.println("Enter the surname:");
//                String newSurname = scanner.next();
//                //records.get(index).setSurname(newSurname);
//                System.out.println("The record updated!");
//                break;
//            case "number":
//                System.out.println("Enter the number:");
//                String newNumber = scanner.next();
//                records.get(index).setPhoneNumber(newNumber);
//                System.out.println("The record updated!");
//                break;
//            default:
//                System.out.println("No valid option");
//        }
    }

}
