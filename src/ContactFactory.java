import java.util.Scanner;

public class ContactFactory {

    Scanner scanner = new Scanner(System.in);

    public Contact newInstance(String type) {
        if (type.equals("person")) {
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
            return contact;
        } else {
            System.out.println("Enter the organization name:");
            String organizationName = scanner.next();
            System.out.println("Enter the address:");
            String address = scanner.next();
            System.out.println("Enter the number:");
            String organizationPhoneNumber = scanner.next();
            return new Organization(organizationName, organizationPhoneNumber, address);
        }
    }

}
