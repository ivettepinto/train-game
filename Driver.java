import java.time.LocalDate;

public abstract class Driver extends User {
    private Train train;
    private int score;
    private String licenseNumber;
    

    public Driver(String name, int age, char gender, LocalDate birthdate, Train train, String licenseNumber) {
        super(name, age, gender, birthdate);
        this.train = train;
        this.score = 0;
        this.licenseNumber = licenseNumber;
    }

    public abstract int getOption();

    public void moveForward(){
        this.score += train.accelerate();
    }

    public void stopMoving(){
        train.stopTrain();
    }

    public void whistle(){
        train.whistle();
    }

    public void turnTrain(){
        train.turn();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    
    
}
