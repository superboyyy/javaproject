package People;

import java.util.Date;

public class Employee extends Person {
    String office;
    int salary;
    Date employedDay = new Date();

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployedDay(Date employedDay) {
        this.employedDay = employedDay;
    }

    @Override
    public String toString() {
        return "name:"+name+" "+"address:"+address+" "+"phonenumber:"+phoneNumber+" "+"email:"+email+" "+"office:"+office+" "+"salary:"+salary+" "+"employedday:"+employedDay;
    }
}
