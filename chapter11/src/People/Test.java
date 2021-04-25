package People;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();

        person.setName("Eddie");
        person.setAddress("Nanjing");
        person.setPhoneNumber("10086");
        person.setEmail("10000@qq.com");
        System.out.println(person.toString());

        student.setName("Eddie");
        student.setAddress("Nanjing");
        student.setPhoneNumber("10086");
        student.setEmail("10000@qq.com");
        student.setGrade(1);
        System.out.println(student.toString());

        employee.setName("Eddie");
        employee.setAddress("Nanjing");
        employee.setPhoneNumber("10086");
        employee.setEmail("10000@qq.com");
        employee.setSalary(10000);
        employee.setOffice("302");
        System.out.println(employee.toString());

        faculty.setName("Eddie");
        faculty.setAddress("Nanjing");
        faculty.setPhoneNumber("10086");
        faculty.setEmail("10000@qq.com");
        faculty.setLevel("5");
        faculty.setTimeOfWork("3");
        System.out.println(faculty.toString());

        staff.setName("Eddie");
        staff.setAddress("Nanjing");
        staff.setPhoneNumber("10086");
        staff.setEmail("10000@qq.com");
        staff.setTitle("Advanced");
        System.out.println(staff.toString());
    }



}
