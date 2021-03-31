package courseclass;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] bigStudents = new String[students.length * 2];
            System.arraycopy(students, 0 , bigStudents, 0, students.length);

            bigStudents[numberOfStudents] = student;
            numberOfStudents++;

            students = bigStudents;
        }

            students[numberOfStudents] = student;
            numberOfStudents++;

    }

    public String[] getStudents() {
        String[] newStudents = new String[numberOfStudents];
        System.arraycopy(students, 0 , newStudents, 0 ,numberOfStudents);
        return newStudents;
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
                for (int j = i + 1; j < students.length; j++) {
                    students[j - 1] = students[j];
                }
                numberOfStudents--;
            }
        }
    }

    public void clear() {
        students = null;
        numberOfStudents = 0;
    }
}
