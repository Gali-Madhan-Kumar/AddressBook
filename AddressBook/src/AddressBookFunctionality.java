import java.util.ArrayList;

public class AddressBookFunctionality implements AddressBookOperations {

    ArrayList<Address> addressArrayList = new ArrayList<>();

    @Override
    public void addAddress(String firstName, String lastName, String city, String state, int zipCode, String mobileNo) {
        Address address = new Address(firstName, lastName, city, state, zipCode, mobileNo);
        addressArrayList.add(address);
    }

    @Override
    public void displayAddressBook() {
        for (Address address : addressArrayList) {
            System.out.print(address.getFirstName() + " " + address.getLastName() + " " + address.getCity() + " " + address.getState() + " " + address.getZipCode() + " " + address.getPhoneNumber());
            System.out.println(" ");
        }
    }

    @Override
    public void editAddress(String firstName, String city, String state, int zipCode, String mobileNo) {
        for (Address address : addressArrayList) {
            if (address.getFirstName().equals(firstName)) {
                address.setCity(city);
                address.setState(state);
                address.setZipCode(zipCode);
                address.setPhoneNumber(mobileNo);
            } else {
                System.out.println("First Name not Found");
            }
        }
    }

    @Override
    public void deleteAddress(String firstName) {
        addressArrayList.removeIf(address -> address.getFirstName().equals(firstName));
    }

    @Override
    public void sortByName() {
        for (int i = 0; i < addressArrayList.size() - 1; i++) {
            for (int j = i + 1; j < addressArrayList.size(); j++) {
                if (addressArrayList.get(i).getFirstName().equals(addressArrayList.get(j).getFirstName())) {
                    if (addressArrayList.get(i).getLastName().compareTo(addressArrayList.get(j).getLastName()) > 0) {
                        Address temp = addressArrayList.get(i);
                        addressArrayList.set(i, addressArrayList.get(j));
                        addressArrayList.set(j, temp);
                    }
                } else {
                    if (addressArrayList.get(i).getFirstName().compareTo(addressArrayList.get(j).getFirstName()) < 0) {
                        Address temp = addressArrayList.get(i);
                        addressArrayList.set(i, addressArrayList.get(j));
                        addressArrayList.set(j, temp);
                    }
                }
            }
        }
    }
}
