package project_jay;

public class Main {
    public static void main(String[] args) {

        Employee jhon = new Contractor("contractor", 12, 10);
        Employee sara = new FullTimeEmployee("full time employee", 8);
        System.out.println("Jhon Salary is: " + jhon.calculateSalary() + " total Salary");
        System.out.println("Sara Salary is: " + sara.calculateSalary() + " total Salary");

    }
}
