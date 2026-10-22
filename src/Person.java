abstract class Person {
    final String personId;
    String firstName;
    String lastName;
    int phoneNumber;

    static int personCount;

    Person (String personId, String fname, String lname, int phoneNum) {
        this.personId = personId;
        this.firstName= fname;
        this.lastName = lname;
        this.phoneNumber = phoneNum;

        personCount++;
    }

    public int getPersonCount() {
        return personCount;
    }

    abstract String getRoleDescription();

    public void displayBasicDetails() {
        System.out.printf("This person's name is %s %s with person id: %s and phone number: %d\n", firstName, lastName, personId, phoneNumber);
    }

    public String ToString() {
        return String.format("Person Id: %s, Full Name: %s %s, Phone Number: %d, Person #%d\n", personId, firstName, lastName, phoneNumber, personCount);
    }
}
