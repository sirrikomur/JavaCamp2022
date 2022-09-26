package bases.entities;

import java.util.List;

public class Customer {
    private int _id;
    private String _customerNumber;
    private String _password;
    private String _phoneNumber;
    private String _email;
    private String _address;
    private List<Loan> _loans;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getCustomerNumber() {
        return _customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        _customerNumber = customerNumber;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password) {
        _password = password;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public List<Loan> getLoans() {
        return _loans;
    }

    public void setLoans(List<Loan> loans) {
        _loans = loans;
    }
}
