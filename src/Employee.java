import java.util.Objects;

public class Employee {

    private String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int counter=1;

   public Employee() {
        this.id=counter++;
    }

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
       return  id;
    }

    public void setDepartment(int department) {
        this.department=department;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    @Override
    public String toString() {
        return getFullName() +  " " + getDepartment() + " "
                + getSalary();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}
