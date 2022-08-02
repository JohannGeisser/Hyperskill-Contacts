public class Person extends Contact {

    private String surname;
    private String birthDate;
    private String gender;

    public Person(String name, String phoneNumber, String surname, String birthDate, String gender) {
        super(name, phoneNumber);
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\n" + "Surname: " + surname + "\n" + "Birth date: " + birthDate + "\n" + "Gender: " +gender + "\n" + "Number:" + super.getPhoneNumber();
    }

    @Override
    public String info() {
        return super.getName() + " " + surname; // We can't get the name property directly because it is declared as private in the father class (if it was protected, we could access it directly)
    }

    @Override
    public void displayFields() {
        System.out.println("Select a field (name, surname, birth, gender, number):");
    }

    @Override
    public void editField(String field, String newValue) {
        switch (field) {
            case "name":
                super.setName(newValue);
                break;
            case "surname":
                this.setSurname(newValue);
                break;
            case "birth":
                this.setBirthDate(newValue);
                break;
            case "gender":
                this.setGender(newValue);
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
            case "name":
                return "Enter the name:";
            case "surname":
                return "Enter the surname:";
            case "birth":
                return "Enter the birth date:";
            case "gender":
                return "Enter the gender (M, F):";
            case "number":
                return "Enter the number:";
            default:
                return "No valid option";
        }
    }
}
