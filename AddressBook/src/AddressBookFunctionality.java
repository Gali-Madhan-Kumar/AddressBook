import java.util.ArrayList;

public class AddressBookFunctionality implements AddressBookOperations {

    ArrayList<Address> addressArrayList = new ArrayList<>();

    @Override
    public void addAddress(String firstName, String lastName, String city, String state, int zipCode, String mobileNo) {
        Address address = new Address(firstName, lastName, city, state, zipCode, mobileNo);
        addressArrayList.add(address);
    }
}
