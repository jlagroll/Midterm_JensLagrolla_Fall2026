class Librarian extends LibraryStaff implements Reservable, Reportable {
    final int dailyIssueLimit;

    int booksProcessed;

    Librarian (String personId, String fname, String lname, int phoneNum, String staffId, String depart, double monthlySalary, int dailyIssue, int bookPro) {
       super(personId, fname, lname, phoneNum, staffId, depart, monthlySalary);

       this.dailyIssueLimit = dailyIssue;
       this.booksProcessed = bookPro;

    }

    String getRoleDescription() {
        return String.format("%s %s is a librarian", firstName, lastName);
    }

    @Override
    double calculateMonthlyCompensation() {
        double processingAllowance = 2.00 * booksProcessed;
        double monthlyCompensation = monthlySalary + processingAllowance;
        return monthlyCompensation;
    }

    @Override
    void displayStaffDetails() {
        System.out.printf("Staff Id: %s, Department: %s, Full Name: %s %s, Monthly Salary: %.2f, Books Processed: %d\n", staffId, department, firstName, lastName, monthlySalary, booksProcessed);
    }

    double calculateFees (int daysOverdue) throws IllegalArgumentException {
        double lateFee;

        if (daysOverdue <= 0) {
           throw new IllegalArgumentException("Days overdue must be above 0");
        }

        else {
            lateFee = 1.00 * daysOverdue;
            return lateFee;
        }
    }

    double calculateFees (int daysOverdue, double dailyRate) throws IllegalArgumentException {
        double lateFee;

        if (daysOverdue <= 0) {
            throw new IllegalArgumentException("Days overdue must be above 0");
        }

        else if (dailyRate > 15.00 || dailyRate <= 0) {
            throw new IllegalArgumentException("Daily rate must be equal or below 15$ and above 0$");
        }

        else {
            lateFee = dailyRate * daysOverdue;
            return lateFee;
        }
    }

    public void reserveBook(String bookId) {
        System.out.printf("Book %s has been reserved", bookId);
        booksProcessed++;
    }


    public void generateReport() {
        System.out.printf("There are %d staff in the Maple Library. %d books have been processed", staffCount, booksProcessed);
    }
}
