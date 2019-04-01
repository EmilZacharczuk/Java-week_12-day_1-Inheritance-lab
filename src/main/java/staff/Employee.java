package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    protected int salary;

    public Employee (String name, String nationalInsuranceNumber, int salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;

    }

    public String getName() {
        return this.name;
    }

    public String getNationalInsuranceNumber() {
        return this.nationalInsuranceNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
        this.salary += amount;}
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
