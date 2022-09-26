package managers.customer;

import bases.managers.CustomerManager;
import entities.customer.PersonalCustomer;

public class PersonalCustomerManager extends CustomerManager {
    public void displayCustomerInformation(PersonalCustomer personalCustomer) {
        System.out.println("Customer;");
        System.out.println("Id: " + personalCustomer.getId());
        System.out.println("Customer Number: " + personalCustomer.getCustomerNumber());
        System.out.println("First Name: " + personalCustomer.getFirstName());
        System.out.println("Last Name: " + personalCustomer.getLastName());
        System.out.println("Phone Number: " + personalCustomer.getPhoneNumber());
        System.out.println("Email: " + personalCustomer.getEmail());
        System.out.println("Address: " + personalCustomer.getAddress());
    }
}
