package entities.customer;

import bases.Customer;

public class PersonalCustomer extends Customer {
    private String _firstName;
    private String _lastName;

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }
}
