package People;

public class Student extends Person {
    int grade = 1 ;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "name:"+name+" "+"address:"+address+" "+"phonenumber:"+phoneNumber+" "+"email:"+email+" "+"grade:"+grade;
    }
}
