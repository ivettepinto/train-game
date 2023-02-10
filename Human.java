import java.time.LocalDate;

public class Human extends Driver {
    public Human(String name, int age, char gender, LocalDate birthdate, Train train, String licenseNumber) {
        super(name, age, gender, birthdate, train, licenseNumber);
    }

    @Override
    public int getOption() {
        return Console.getInt();
    }
    
}
