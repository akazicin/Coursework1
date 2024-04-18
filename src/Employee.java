public class Employee {

    private String firstName;
    private String secondName;
    private String lastName;
    private int department;
    private int salary;
    private int id;
    static int counter=0;

    Employee() {
        id=counter++;
    }

    public Employee(String firstName, String secondName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment() {
        this.department=department;
    }

    public void setSalary() {
        this.salary=salary;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getSecondName() + " " + getLastName() + " " + getDepartment() + " "
                + getSalary();
    }



}
