package bases.entities;

public class Loan {
    private int _id;
    private String _name;
    private double _interestRate;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public double getInterestRate() {
        return _interestRate;
    }

    public void setInterestRate(double interestRate) {
        _interestRate = interestRate;
    }
}
