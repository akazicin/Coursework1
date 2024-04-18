public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Сергей", "Владимирович", "Иванов",
                1, 25000);
        Employee employee1 = new Employee("Михаил", "Евгеньевич", "Караваев",
                2, 35000);



        System.out.println(employee);
        System.out.println(employee1);
    }
}