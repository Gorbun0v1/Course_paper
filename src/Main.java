public class Main {
    public static void main(String[] args) {


        employeeList[0] = new Employee("Аксенов Антон Викторович", "1", 10_000);
        employeeList[1] = new Employee("Бацан Марина Викторовна", "1", 10_000);
        employeeList[2] = new Employee("Шапко Александр Викторович", "2", 10_000);
        employeeList[3] = new Employee("Власов Алексей Евгеньевич", "2", 110_000);
        employeeList[4] = new Employee("Тиньков Дмитрий Александрович", "3", 150_000);
        employeeList[5] = new Employee("Зурнин Владислав Евгеньевич", "3", 20_000);
        employeeList[6] = new Employee("Горбунов Олег Юрьевич", "4", 123_000);
        employeeList[7] = new Employee("Деревсков Максим Анатольевич", "4", 1_000);
        employeeList[8] = new Employee("Малышкин Анатолий Анатольевич", "5", 110_000);
        employeeList[9] = new Employee("Бочков Максим Антонович", "5", 357_000);

        printEmployeeData();
        countMonthSalarySum();
        countMinMonthSalary();
        countMaxMonthSalary();
        countAvgMonthSalary();
        printFullName();
        System.out.println();
    }

    static Employee[] employeeList = new Employee[10];

    private static void printEmployeeData() {
        for (Employee employee : Main.employeeList) {
            System.out.println(employee);
        }
    }

    private static double countMonthSalarySum() {
        double sumMonthSalary = 0;
        for (Employee employee : Main.employeeList) {
            double salary = employee.getSalary();
            sumMonthSalary = sumMonthSalary + salary;
        }
        return sumMonthSalary;
    }

    private static void countMinMonthSalary() {
        double minMonthSalary = Main.employeeList[0].getSalary();
        for (Employee employee : Main.employeeList) {
            double currentMonthSalary = employee.getSalary();
            if (currentMonthSalary < minMonthSalary) {
                minMonthSalary = currentMonthSalary;
            }
        }
        System.out.println("minMonthSalary = " + String.format("%.2f", minMonthSalary));
        System.out.println();
    }

    private static void countMaxMonthSalary() {
        double maxMonthSalary = Main.employeeList[0].getSalary();
        for (Employee employee : Main.employeeList) {
            double currentMonthSalary = employee.getSalary();
            if (currentMonthSalary > maxMonthSalary) {
                maxMonthSalary = currentMonthSalary;
            }
        }
        System.out.println("maxMonthSalary = " + String.format("%.2f", maxMonthSalary));
        System.out.println();
    }

    private static void countAvgMonthSalary() {
        double employeeNumber = employeeList.length;
        double sumMonthSalary = countMonthSalarySum();
        double avgMonthSalary = sumMonthSalary / employeeNumber;
        String avgMonthSalaryRound = String.format("%.2f", avgMonthSalary);
        System.out.println("Средняя сумма ЗП " + avgMonthSalaryRound + " рублей.");
        System.out.println();
    }

    private static void printFullName() {
        for (int j = 0; j < Main.employeeList.length; j++) {
            if (j != Main.employeeList.length - 1) {
                System.out.print(Main.employeeList[j].getFullName() + ", ");
            } else {
                System.out.print(Main.employeeList[j].getFullName());
            }
        }
        System.out.println();
    }
    }
