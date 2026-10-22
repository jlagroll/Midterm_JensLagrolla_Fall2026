class SeniorLibrarian extends Librarian {
    final String specialization;
    double seniorityAllowance;

    SeniorLibrarian (String personId, String fname, String lname, int phoneNum, String staffId, String depart, double monthlySalary, int dailyIssue, int bookPro, String spec, double senAllow) {
        super(personId, fname, lname, phoneNum, staffId, depart, monthlySalary, dailyIssue, bookPro);

        this.specialization = spec;
        this.seniorityAllowance = senAllow;

    }

    @Override
    double calculateMonthlyCompensation() {
        double processingAllowance = 2.00 * booksProcessed;
        double monthlyCompensation = monthlySalary + processingAllowance;
        double seniorCompensation = monthlyCompensation + seniorityAllowance;
        return seniorCompensation;
    }

    @Override
    void displayStaffDetails() {
        System.out.printf("Staff Id: %s, Full Name: %s %s, Monthly Salary: %f2, Specilization: %s, Seniority Allowance: %.2f\n", staffId, firstName, lastName, monthlySalary, specialization, seniorityAllowance);
    }
}
