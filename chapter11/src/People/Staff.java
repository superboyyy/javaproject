package People;

public class Staff extends Employee {
    String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "name:"+name+" "+"address:"+address+" "+"phonenumber:"+phoneNumber+" "+"email:"+email+" "+"title:"+title;
    }
}
