public class Employee {
    private final String name;
    private int department;
    private double salary;
    private static int counter = 1;
    private final int id;


    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + getName() + ". Отдел: " + getDepartment() + ". Зарплата: " + getSalary() + ". id: " + id + ".";
    }
}
