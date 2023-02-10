import java.time.LocalDate;
import java.util.ArrayList;

public class TrainGame {
    Driver driver;
    Track track;
    Train train;

    public void setup() {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        passengers.add(new Passenger("Carolina", 22, 'F', LocalDate.now(), "SV1"));
        passengers.add(new Passenger("Maria", 21, 'F', LocalDate.now(), "SV2"));

        ArrayList<Wagon> wagons = new ArrayList<Wagon>();
        wagons.add(new PassengerWagon(passengers));

        train = new Train(new MainWagon(true, 20), wagons);
        track = new Track(1, train);
        setPlayerType();
    }

    public void execute() {
        int input = 0;
        boolean cont = true;

        do {
            System.out.println("\n\t TRAIN GAME");
            System.out.println("--------------------------------------");
            System.out.println("1) Turn on/off the train");
            System.out.println("2) Move train forward");
            System.out.println("3) Whistle");
            System.out.println("4) Stop train");
            System.out.println("5) Quit game");
            System.out.print("\n\tYour Option: ");
            input = driver.getOption();

            switch (input) {
                case 1:
                    driver.turnTrain();
                    break;
                case 2:
                    driver.moveForward();
                    break;
                case 3:
                    driver.whistle();
                    break;
                case 4:
                    driver.stopMoving();
                    break;
                case 5:
                    endGame();
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        } while (cont == true);
    }

    private void setPlayerType() {
        int type = 0;
        do {
            System.out.println("Select user type");
            System.out.println("1) Human");
            System.out.println("2) Computer");
            System.out.print("\tYour option: ");
            type = Console.getInt();
            System.out.println("T " + type);
            switch (type) {
                case 1:
                    driver = new Human("Ivette", 22, 'F', LocalDate.now(), train, "P1234");
                    break;
                case 2:
                    driver = new Computer("Ivette", 22, 'F', LocalDate.now(), train, "P1234");
                    break;
                default:
                    System.out.println("Please select a type");
                    break;
            }
        } while (type < 1 || type > 2);
    }

    private void endGame() {
        if (driver.getScore() >= 10) {
            System.out.println("CONGRATULATIONS! YOU WON WITH " + driver.getScore() + " POINTS");
        } else {
            System.out.println("BYE, BYE! SEE YOU LATER");
        }
    }

}