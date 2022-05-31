public class Employee {
    private final String fullName;
    private String departmentName;
    private int salary;
    private static int counterId = 1;
    private final int departmentId;

    public Employee(String fullName, String departmentName, int salary) {
        this.fullName = fullName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.departmentId = counterId++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounterId() {
        return counterId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee data: " + "\n" +
                "fullName='" + fullName + '\'' +
                " departmentName='" + departmentName + '\'' +
                " salary=" + salary +
                " departmentId=" + departmentId +
                "\n";
    }

}
