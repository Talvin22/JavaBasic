package HomeWork_12_1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone_number;
    private Integer age;


    public Employee(String name, String position, String email, String phone_number, Integer age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Talvin", "Developer", "test@gmail.com", "+4912232434", 20);

    }
}
