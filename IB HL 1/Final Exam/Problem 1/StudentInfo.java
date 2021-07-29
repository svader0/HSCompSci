public class StudentInfo {
    // instance variables
    private String lastName;
    private String firstName;
    private String id;
    private String address;
    private String phone;

    // constructor
    public StudentInfo(String l, String f, String i, String a, String p) {
        lastName = l;
        firstName = f;
        id = i;
        address = a;
        phone = p;
    }

    // Accessor Methods
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return "Last Name : " + lastName + "\n" + "First Name : " + firstName + "\n" + "ID # : " + id + "\n"
                + "Address : " + address + "\n" + "Phone : " + phone;
    }
}