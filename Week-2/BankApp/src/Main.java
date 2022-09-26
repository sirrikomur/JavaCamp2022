import entities.customer.PersonalCustomer;
import entities.loan.CarLoan;
import entities.loan.EducationLoan;
import managers.customer.PersonalCustomerManager;

public class Main {
    public static void main(String[] args) {
        // Customer
        PersonalCustomer personalCustomer = new PersonalCustomer();
        personalCustomer.setId(1);
        personalCustomer.setCustomerNumber("Km48591Dv");
        personalCustomer.setFirstName("Sırrı");
        personalCustomer.setLastName("KÖMÜR");
        personalCustomer.setEmail("sirrikomur@example.com");
        personalCustomer.setPassword("zxcv123+*654QWE");
        personalCustomer.setAddress("Türkiye");
        personalCustomer.setPhoneNumber("+905555555555");

        PersonalCustomerManager personalCustomerManager = new PersonalCustomerManager();
        personalCustomerManager.create(personalCustomer);
        personalCustomerManager.displayCustomerInformation(personalCustomer);

        personalCustomer.setEmail("komursirri@example.com");
        personalCustomerManager.update(personalCustomer);
        personalCustomerManager.displayCustomerInformation(personalCustomer);


        // Loans
        EducationLoan educationLoan = new EducationLoan();
        educationLoan.setId(1);
        educationLoan.setName("Education Loan");
        educationLoan.setInterestRate(2.49);

        CarLoan carLoan = new CarLoan();
        carLoan.setId(2);
        carLoan.setName("Car Loan");
        carLoan.setInterestRate(1.55);

        personalCustomerManager.addLoan(personalCustomer, educationLoan, carLoan);

        personalCustomerManager.displayLoans(personalCustomer);
    }
}