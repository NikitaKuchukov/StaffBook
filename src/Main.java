public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void printSeparator() {
        System.out.println("----------------------------------------------------" +
                             "-----------------------------------------------");
    }
    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calculateSalaries(Employee[] salaries) {
        double totalSalaryForMonth = 0;
        for (Employee salary : salaries) {
            totalSalaryForMonth += salary.getSalary();
        }
        return totalSalaryForMonth;
    }

    public static String findEmployeeWithMinSalary(Employee[] employees) {
        double minSalary = 99999999;
        Employee employee = employees[0];
        for (Employee value : employees) {
            if (value.getSalary() < minSalary) {
                employee = value;
                minSalary = value.getSalary();
            }
        }
        return employee.toString();
    }

    public static String findEmployeeWithMaxSalary(Employee[] employees) {
        double maxSalary = 0;
        Employee employee = employees[0];
        for (Employee value : employees) {
            if (value.getSalary() > maxSalary) {
                employee = value;
                maxSalary = value.getSalary();
            }
        }
        return employee.toString();
    }

    public static void printNamesEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Антонов Антон Антонович", 1, 156600);
        employees[1] = new Employee("Богданов Богдан Богданович", 3, 184200);
        employees[2] = new Employee("Васильев Василий Васильевич", 2, 112500);
        employees[3] = new Employee("Григорьев Григорий Григорьевич", 4, 118600);
        employees[4] = new Employee("Дмитриев Дмитрий Дмитриевич", 5, 179200);
        employees[5] = new Employee("Захаров Захар Захарович", 2, 136400);
        employees[6] = new Employee("Михайлов Михаил Михайлович", 4, 181000);
        employees[7] = new Employee("Никитов Никита Никитович", 1, 145300);
        employees[8] = new Employee("Петров Петр Петрович", 5, 126900);
        employees[9] = new Employee("Сергеев Сергей Сергеевич", 3, 164400);

        System.out.println("Книга сотрудников");
        printAllEmployees(employees);

        printSeparator();

        double totalSalaryForMonth = calculateSalaries(employees);
        System.out.println("Сумма всех зарплат в месяц: " + totalSalaryForMonth);

        printSeparator();

        String employeeWithMinSalary = findEmployeeWithMinSalary(employees);
        System.out.println("Минимальная зарплата: " + employeeWithMinSalary);

        printSeparator();

        String employeeWithMaxSalary = findEmployeeWithMaxSalary(employees);
        System.out.println("Максимальная зарплата: " + employeeWithMaxSalary);

        printSeparator();

        double middleSalaryForMonth = totalSalaryForMonth / employees.length;
        System.out.println("Среднее значение зарплат за месяц: " + middleSalaryForMonth);

        printSeparator();

        System.out.println("Ф.И.О. сотрудников:");
        printNamesEmployees(employees);
    }
}
