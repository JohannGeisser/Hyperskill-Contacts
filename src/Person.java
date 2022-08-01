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
}
