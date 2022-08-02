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
            return new Person(personName, personPhoneNumber, surname, birthDate, gender);
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
