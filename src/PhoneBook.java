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
        records.get(index).displayFields();
        String field = scanner.next();
        System.out.println(records.get(index).showField(field));
        String newValue = scanner.next();
        records.get(index).editField(field, newValue);
        System.out.println("The record updated!");
    }

}
