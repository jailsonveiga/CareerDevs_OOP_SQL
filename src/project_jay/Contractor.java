package project_jay;

public class Contractor extends Employee {

    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

}
