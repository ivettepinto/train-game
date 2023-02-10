import java.time.LocalDate;

public class User{
    private String name;
    private int age;
    private char gender;
    private LocalDate birthdate;
    
    public User(String name, int age, char gender, LocalDate birthdate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthdate = birthdate;
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
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


}