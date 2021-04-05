public class Customer {

    private String firstName;
    private String lastName;
    private String ID;
    private String NIC;
    private String passport;
    private String address;
    private String dob;
    private String gender;
    private String contact;

    Customer() {
        ID = null;
        firstName = null;
        lastName = null;
        NIC = null;
        passport = null;
        address = null;
        dob = null;
        gender = null;
        contact = null;
    }

    Customer(String ID, String firstName, String lastName, String NIC, String passport, String address,
             String dob, String gender, String contact) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.NIC = NIC;
        this.passport = passport;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", NIC='" + NIC + '\'' +
                ", passport='" + passport + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
