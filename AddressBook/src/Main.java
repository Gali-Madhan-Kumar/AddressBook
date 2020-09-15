import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AddressBookFunctionality addressBookFunctionality = new AddressBookFunctionality();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter How Many Addresses to Store ");
        int n = input.nextInt();

        String firstName;
        String lastName;
        String city;
        String state;
        int zipCode;
        String mobileNo;

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

        addressBookFunctionality.displayAddressBook();
    }
}
