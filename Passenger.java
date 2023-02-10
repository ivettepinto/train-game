import java.time.LocalDate;

public class Passenger extends User {
    private String boardingPassNumber;

    public Passenger(String name, int age, char gender, LocalDate birthdate, String boardingPassNumber) {
        super(name, age, gender, birthdate);
        this.boardingPassNumber = boardingPassNumber;
    }

    public String getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(String boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    
    
}
