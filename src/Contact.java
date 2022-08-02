public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        if(hasNumber(phoneNumber)) {
            System.out.println("Wrong number format!");
            this.phoneNumber = "[no number]";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(hasNumber(phoneNumber)) {
            System.out.println("Wrong number format!");
            this.phoneNumber = "[no number]";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public static boolean hasNumber(String phoneNumber) {
        return phoneNumber.contains("+");
    }

    @Override
    public String toString() {
        return name + ", " + phoneNumber;
    }


    public String info() {
        return name;
    }

    public void displayFields() {
        System.out.println("Select a field (name, number):");
    }

}
