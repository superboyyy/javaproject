package courseclass;

public class TestCourse {
    public static void main(String[] args) {
        Course maths = new Course("maths");

        maths.addStudent("Andy");
        maths.addStudent("Hobo");
        maths.addStudent("Eddie");
        maths.addStudent("wdy");

        maths.dropStudent("Hobo");

        System.out.println(maths.getStudents());
    }
}
