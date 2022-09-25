import entities.customer.PersonalCustomer;
import managers.customer.PersonalCustomerManager;

public class Main {
    public static void main(String[] args) {
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
        personalCustomerManager.displayInformation(personalCustomer);

        personalCustomer.setEmail("komursirri@example.com");
        personalCustomerManager.update(personalCustomer);
        personalCustomerManager.displayInformation(personalCustomer);

        personalCustomerManager.delete(personalCustomer);
    }
}