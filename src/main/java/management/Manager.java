package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nationalInsuranceNumber, int salary, String deptName) {

        super(name, nationalInsuranceNumber, salary);

        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }


}
