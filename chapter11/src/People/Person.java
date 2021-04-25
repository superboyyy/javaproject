package People;

public class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name:"+name+" "+"address:"+address+" "+"phonenumber:"+phoneNumber+" "+"email:"+email;
    }
}
