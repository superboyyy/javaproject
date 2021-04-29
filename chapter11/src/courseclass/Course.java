package courseclass;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public String getStudents() {
        String studentList = "";
        for (int i = 0; i < students.size(); i++) {
            studentList += students.get(i) + " ";
        }
        return studentList;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        if (students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        }
    }

    public void clear() {
        students = null;
        numberOfStudents = 0;
    }
}
