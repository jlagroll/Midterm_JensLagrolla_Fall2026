import java.util.Scanner;

/*
* Maple Leaf Public Library requires a console-based Library Management System to register
* members, manage library staff, calculate late fees, reserve books, and generate reports.
* */

public static void main(String[] args) {
    Book[] library = {
            new Book(000000001, "J7R24HJ", "The Hobbit", "J.R.R", "Tolkien", false),
            new Book(000000002, "KF2GVBN", "1984", "George", "Orwell", true)
    };

    Member mem1 = new Member("000000001", "Robert", "Patterson", 647892124, "R7UI12CF", 35, "Basic", 0.00);
    Member mem2 = new Member("000000002", "Kristen", "Stewart", 647235612, "K8VF4G5", 25, "Gold", 250.00);
    Member mem3 = new Member("00000012", "Yunjin", "Huh", 647891145, "GBHUH4219", 25, "Basic", 0.00);

    Librarian chrisEvans = new Librarian("000000003", "Chris", "Evans", 415233902, "FG25FC678", "A01", 25000.00, 10, 25);
    SeniorLibrarian scarlettJohan = new SeniorLibrarian("000000004", "Scarlett", "Johann", 415002762, "CCV217JK", "B25", 30000.00, 6, 32, "Biology", 25000);
    LibraryAssistant chadwickBoseman = new LibraryAssistant("000000005", "Chadwick", "Boseman", 456113890, "GB42JK67", "C56", 15000, "Part-Time", 4000);

    // Display of members and staff
    mem1.displayBasicDetails();
    mem2.displayBasicDetails();
    chrisEvans.displayStaffDetails();
    scarlettJohan.displayStaffDetails();
    chadwickBoseman.displayStaffDetails();

    System.out.println("\n");

    // Late Fee Overloaded Method
    double lateFee = chrisEvans.calculateFees(12);
    double lateFee2 = chrisEvans.calculateFees(12, 5.5);
    System.out.printf("Librarian %s has calculate a $%.2f late fee for %s\n", chrisEvans.firstName, lateFee, mem1.firstName);
    System.out.printf("Librarian %s has calculate a $%.2f late fee for %s", chrisEvans.firstName, lateFee2, mem2.firstName);

    System.out.println("\n");

    // Monthly Compensation for Library Staff
    System.out.printf("Compensation for librarian %s is $%.2f\n", chrisEvans.firstName, chrisEvans.calculateMonthlyCompensation());
    System.out.printf("Compensation for senior librarian %s is $%.2f\n", scarlettJohan.firstName, scarlettJohan.calculateMonthlyCompensation());
    System.out.printf("Compensation for assistant librarian %s is $%.2f", chadwickBoseman.firstName, chadwickBoseman.calculateMonthlyCompensation());

    System.out.println("\n");

    // Total number of Person, Member, and LibraryStaff
    System.out.printf("There are %d people\n", mem2.getPersonCount());
    System.out.printf("There are %d members\n", mem1.getMemberCount());
    System.out.printf("There are %d library staff", scarlettJohan.getStaffCount());

    System.out.println("\n");

    // Runtime Polymorphism using LibraryStaff References
    LibraryStaff staff1 = chrisEvans;
    LibraryStaff staff2 = scarlettJohan;
    LibraryStaff staff3 = chadwickBoseman;

    System.out.println(staff1.getRoleDescription());
    System.out.printf("The monthly salary of %s is $%.2f\n", staff2.firstName, staff2.monthlySalary);
    System.out.printf("The monthly compensation of %s is $%.2f", staff3.lastName, staff3.calculateMonthlyCompensation());

    System.out.println("\n");

    // Demonstrate the interfaces
    chrisEvans.reserveBook(library[0].getBookId());
    System.out.println("\n");
    chrisEvans.generateReport();

    System.out.println("\n");

    // Display Successful and Unsuccessful Member Registration and Reservation Messages
    mem1.registerMember(mem1, mem1.memberNumber, mem1.age, mem1.outstandingFees);
    mem2.registerMember(mem2, mem2.memberNumber, mem2.age, mem2.outstandingFees);
    mem3.registerMember(mem3, mem3.memberNumber, mem3.age, mem3.outstandingFees);
}