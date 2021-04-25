package People;

public class Faculty extends Employee {
    String timeOfWork;
    String level;

    public void setLevel(String level) {
        this.level = level;
    }

    public void setTimeOfWork(String timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    @Override
    public String toString() {
        return "name:"+name+" "+"address:"+address+" "+"phonenumber:"+phoneNumber+" "+"email:"+email+" "+"timeofwork:"+timeOfWork+" "+"level:"+level;
    }
}
