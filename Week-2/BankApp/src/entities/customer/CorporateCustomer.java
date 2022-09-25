package entities.customer;

import bases.Customer;

public class CorporateCustomer extends Customer {
    private String _companyName;
    private String _taxNumber;

    public String getCompanyName() {
        return _companyName;
    }

    public void setCompanyName(String companyName) {
        _companyName = companyName;
    }

    public String getTaxNumber() {
        return _taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        _taxNumber = taxNumber;
    }
}
