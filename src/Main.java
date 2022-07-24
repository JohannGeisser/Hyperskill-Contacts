import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        String name = scanner.next();
        System.out.println("Enter the surname of the person:");
        String surname = scanner.next();
        System.out.println("Enter the number:");
        String phoneNumber = scanner.next();

        Contact contact = new Contact(name, surname, phoneNumber);
        System.out.println("A record created!\n" + "A Phone Book with a single record created!");
    }

}

//NUEVO DIFF
//Nueva info para git