package StudentScoreManagement;

public class Student {
    private String studentNumber;
    private String name;
    private String gender;
    private int collegeenglishScore;
    private int advancedmathematicsScore;

    public Student (String studentNumber, String name, String gender, int collegeenglishScore, int advancedmathematicsScore) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
        this.collegeenglishScore = collegeenglishScore;
        this.advancedmathematicsScore = advancedmathematicsScore;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCollegeenglishScore() {
        return collegeenglishScore;
    }

    public void setCollegeenglishScore(int collegeenglishScore) {
        this.collegeenglishScore = collegeenglishScore;
    }

    public int getAdvancedmathematicsScore() {
        return advancedmathematicsScore;
    }

    public void setAdvancedmathematicsScore(int advancedmathematicsScore) {
        this.advancedmathematicsScore = advancedmathematicsScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", collegeenglishScore=" + collegeenglishScore +
                ", advancedmathematicsScore=" + advancedmathematicsScore +
                '}';
    }
}
