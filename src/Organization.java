public class Organization extends Contact {

    private String address;

    public Organization(String name, String phoneNumber, String address) {
        super(name, phoneNumber);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Organization name: " + super.getName() + "\n" + "Address: " + address + "\n" + "Number: " + super.getPhoneNumber();
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public void displayFields() {
        System.out.println("Select a field (address, number):");
    }

    @Override
    public void editField(String field, String newValue) {
        switch (field) {
            case "address":
                this.setAddress(newValue);
                break;
            case "number":
                super.setPhoneNumber(newValue);
                break;
            default:
                System.out.println("No valid option");
        }
    }

    @Override
    public String showField(String field) {
        switch (field) {
            case "address":
                return "Enter the address:";
            case "number":
                return "Enter the number:";
            default:
                return "No valid option";
        }
    }
}
