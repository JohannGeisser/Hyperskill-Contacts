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
}
