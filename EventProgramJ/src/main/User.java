package main;

public class User {
    private String name;
    private String adress;
    private int age;
    private String sex;
    private String email;

    public User (String name, String adress, int age, String sex, String email){
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public int getAge() {
        return age;
    }
    public String sex() {
        return sex;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setEmail(String email){
        this.email = email;
    }


}
