package courseclass;

public class TestCourse {
    public static void main(String[] args) {
        Course maths = new Course("maths");

        maths.addStudent("Andy");
        maths.addStudent("Hobo");
        maths.addStudent("Eddie");

        maths.dropStudent("Hobo");

        for (String student: maths.getStudents()
             ) {
            System.out.println(student);
        }
    }
}
