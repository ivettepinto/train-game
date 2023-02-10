import java.time.LocalDate;
import java.util.Random;

public class Computer extends Driver {

    private int[] options = {1,2,3,4,5};

    public Computer(String name, int age, char gender, LocalDate birthdate, Train train, String licenseNumber) {
        super(name, age, gender, birthdate, train, licenseNumber);
    }

    @Override
    public int getOption() {
        Random random = new Random();
        int tmp = options[random.nextInt(5)];
        return tmp;
    }
    
    
}
