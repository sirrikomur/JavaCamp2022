package bases.managers;

import bases.entities.Customer;
import bases.entities.Loan;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    public void create(Customer customer) {
        System.out.println("Created a new customer: " + customer.getCustomerNumber() + ".");
    }

    public void update(Customer customer) {
        System.out.println("Updated customer " + customer.getCustomerNumber() + ".");
    }

    public void delete(Customer customer) {
        System.out.println("Deleted customer: " + customer.getCustomerNumber() + ".");
    }

    public void displayLoans(Customer customer) {
        System.out.println("Customer " + customer.getCustomerNumber() + "'s loans: ");
        for (Loan loan : customer.getLoans()) {
            System.out.println("--> " + loan.getName());
        }
    }

    public void addLoan(Customer customer, Loan... loans) {
        List<Loan> newLoans;

        if (loans == null) {
            newLoans = customer.getLoans();
        } else {
            newLoans = new ArrayList<>();
        }

        for (Loan loan : loans) {
            newLoans.add(loan);
        }

        customer.setLoans(newLoans);
    }
}
