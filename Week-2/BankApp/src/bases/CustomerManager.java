package bases;

public class CustomerManager {
    public void create(Customer customer){
        System.out.println("Created a new customer: " + customer.getCustomerNumber() + ".");
    }

    public void update(Customer customer){
        System.out.println("Updated customer " + customer.getCustomerNumber() + ".");
    }

    public void delete(Customer customer){
        System.out.println("Deleted customer: " + customer.getCustomerNumber() + ".");
    }


}
