import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AddressBookFunctionality addressBookFunctionality = new AddressBookFunctionality();

        String firstName;
        String lastName;
        String city;
        String state;
        int zipCode;
        String mobileNo;
        char c;

        Scanner input = new Scanner(System.in);

        do {

            System.out.println("1.Add Address");
            System.out.println("2.Edit Address");
            System.out.println("3.Delete Address");
            System.out.println("4.Sort By Name");
            System.out.println("5.Sort By Zip");
            System.out.println("Choose the option ");
            int opt = input.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter How Many Addresses to Store ");
                    int n = input.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter FirstName");
                        firstName = input.next();
                        System.out.println("Enter LastName");
                        lastName = input.next();
                        System.out.println("Enter City");
                        city = input.next();
                        System.out.println("Enter State");
                        state = input.next();
                        System.out.println("Enter ZipCode");
                        zipCode = input.nextInt();
                        System.out.println("Enter mobileNo");
                        mobileNo = input.next();
                        addressBookFunctionality.addAddress(firstName, lastName, city, state, zipCode, mobileNo);
                    }
                    break;

                case 2:
                    System.out.println("Enter First Name of the Person to edit his/her address details");
                    firstName = input.next();
                    System.out.println("Enter City to update");
                    city = input.next();
                    System.out.println("Enter State to update");
                    state = input.next();
                    System.out.println("Enter ZipCode to update");
                    zipCode= input.nextInt();
                    System.out.println("Enter mobile Number to update");
                    mobileNo = input.next();
                    addressBookFunctionality.editAddress(firstName, city, state, zipCode, mobileNo);
                    break;
            }
            addressBookFunctionality.displayAddressBook();
            System.out.println("Do you want to continue....[Y|N]");
            c = input.next().charAt(0);
        }
        while (c == 'Y' || c == 'y');
    }
}
