public interface AddressBookOperations {
    void addAddress(String firstName, String lastName, String city, String state, int zipCode, String mobileNo);

    void displayAddressBook();

    void editAddress(String firstName, String city, String state, int zipCode, String mobileNo);

    void deleteAddress(String firstName);

    void sortByName();

    void sortByZip();
}
