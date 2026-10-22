class Member extends Person {
    final String memberNumber;
    int age;
    String membershipType;
    double outstandingFees;

    static int memberCount;

    Member (String personId, String fname, String lname, int phoneNum, String memberNum, int age, String memberType, double outFees) {
        super(personId, fname, lname, phoneNum);

        this.memberNumber = memberNum;

        if (age < 18)  {
            throw new IllegalArgumentException("Member must be 18 years old and above");
        }

        else {
            this.age = age;
        }

        this.membershipType = memberType;
        this.outstandingFees = outFees;

        memberCount++;
    }

    int getMemberCount() {
        return memberCount;
    }

    String getRoleDescription() {
        return String.format("%s %s is a member\n", firstName, lastName);
    }

    // registerMember must add to a list of Members

    /**
     * Accepts basic registration (No membership type).
     */
    public void registerMember(Person person, String memberNumber, int age, double outFees) {
        if (outFees >= 100.00) {
            System.out.println("Outstanding fees limit reached. Registration failed");
        }
        else if (memberNumber.length() != 9) {
            System.out.println("Member number must be 9 characters. Registration failed");
        }
        else {
            System.out.println("Member successfully registered.");
        }
    }

    /**
     * Accepts registration with membership type.
     */
    public void registerMember(Person person, String memberNum, int age, String memberType, double outFees) {
        String[] memberTypeList = {"Basic", "Gold", "Platinum"};
        if (outFees >= 100.00) {
            System.out.println("Outstanding fees limit reached. Registration failed");
        }
        else if (memberNumber.length() != 9) {
            System.out.println("Member number must be 9 characters. Registration failed");
        }

        else {
            for (String memberTypeVar : memberTypeList) {
                if (memberTypeVar != memberType) {
                    System.out.println("Member type is invalid. Registration failed");
                }
                else {
                    System.out.printf("Member successfully registered as %s", memberType);
                }
            }
        }
    }
}
