import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> records = new ArrayList<Contact>();


    public void addRecord(Contact contact) {
        records.add(contact);
    }

}
