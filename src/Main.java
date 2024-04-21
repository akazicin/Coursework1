public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Сергей Владимирович Иванов",
                1, 25000);
        employees[1] = new Employee("Михаил Евгеньевич Караваев",
                2, 35000);
        employees[2] = new Employee("Михаил Евгеньевич Карасёв",
                3, 32500);
        employees[3] = new Employee("Михаил Антатольевич Корноухов", 4, 42000);
        employees[4] = new Employee("Валентин Валентинович Ласточкин", 5, 29900);
        employees[5] = new Employee("Ирина Павловна Семыкина", 6, 44350);
        employees[6] = new Employee("Марина Александровна Уськина", 7, 52000);
        employees[7] = new Employee("Ольга Васильевна Левшина", 8, 75299);
        employees[8] = new Employee("Константин Игоревич Малаев", 9, 58930);
        employees[9] = new Employee("Милена Ивановна Бунтарева", 10, 60000);


        printAll();
        System.out.println(sumAllSalary());
        System.out.println(employeeWithMinSalary());
        System.out.println(employeeWithMaxSalary());
        System.out.println(averageSalary());
        printAllFullNames();
    }


    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double sumAllSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;

    }

    private static Employee employeeWithMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    private static Employee employeeWithMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    private static double averageSalary() {
        return sumAllSalary()/employees.length;

    }

    private static void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());

        }
    }


}






