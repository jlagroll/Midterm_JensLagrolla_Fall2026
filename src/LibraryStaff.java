abstract class LibraryStaff extends Person {
    final String staffId;
    String department;
    double monthlySalary;
    static int staffCount;



    LibraryStaff (String personId, String fname, String lname, int phoneNum, String staffId, String depart, double monthlySalary) {
        super(personId, fname, lname, phoneNum);

        this.staffId = staffId;
        this.department = depart;
        this.monthlySalary = monthlySalary;

        staffCount++;
    }

    int getStaffCount() {
        return staffCount;
    }

    String getRoleDescription() {
        return String.format("%s %s is a library staff\n", firstName, lastName);
    }

    abstract double calculateMonthlyCompensation();

    void displayStaffDetails() {
        System.out.printf("Staff Id: %s, Department: %s, Full Name: %s %s, Monthly Salary: $%f2\n", staffId, department, firstName, lastName, monthlySalary);
    }
}
