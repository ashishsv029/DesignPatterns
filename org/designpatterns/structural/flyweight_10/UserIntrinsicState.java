package org.designpatterns.structural.flyweight_10;
// This is the flyweight
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private byte[] photo = "photo content".getBytes();

    public UserIntrinsicState(String name, int age, String gender, String email, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }
}
