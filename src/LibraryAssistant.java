class LibraryAssistant extends LibraryStaff {
    final String shiftType;
    double shiftAllowance;

    LibraryAssistant (String personId, String fname, String lname, int phoneNum, String staffId, String depart, double monthlySalary, String shiftT, double shiftA) {
        super(personId, fname, lname, phoneNum, staffId, depart, monthlySalary);

        this.shiftType = shiftT;
        this.shiftAllowance = shiftA;

    }

    @Override
    double calculateMonthlyCompensation() {
        double assistantCompensation = monthlySalary + shiftAllowance;
        return assistantCompensation;
    }

    @Override
    void displayStaffDetails() {
        System.out.printf("Staff Id: %s, Full Name: %s %s, Monthly Salary: %f2, Shift Type: %s, Shift Allowance: %.2f\n", staffId, firstName, lastName, monthlySalary, shiftType, shiftAllowance);
    }

}
