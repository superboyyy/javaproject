package Course;

import java.lang.reflect.Array;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] newStudents = new String[students.length * 2];
            for (int i = 0; i < numberOfStudents; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
            students[numberOfStudents] = student;
            numberOfStudents++;
    }

    public String[] getStudents() {
        String[] newStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            newStudents[i] = students[i];
        }
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                for (int j = i; j < students.length; j++) {
                    students[j] = students[j+1];
                }
                numberOfStudents--;
            }
        }
    }
}
