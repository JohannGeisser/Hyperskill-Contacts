import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> records = new ArrayList<Contact>();


    public void addRecord(Contact contact) {
        records.add(contact);
    }

    public int countRecords() {
        return records.size();
    }

    public void displayRecords() {
        for (int i = 0; i < records.size(); i++) {
            System.out.println(i + 1 + ". " + records.get(i));
        }
    }

    public void removeRecords(int index) {
        records.remove(index);
        System.out.println("The record removed!");
    }

}
