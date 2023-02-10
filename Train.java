import java.util.ArrayList;

public class Train {
    private MainWagon mainWagon;
    private ArrayList<Wagon> wagons;
    private int points = 0;

    public Train(MainWagon mainWagon, ArrayList<Wagon> wagons) {
        this.mainWagon = mainWagon;
        this.wagons = wagons;
    }

    public int accelerate(){
        if(mainWagon.getIsOn()){
            System.out.println("The train is accelerating " + mainWagon.getPower() + " HP");
            points += mainWagon.getPower();
            System.out.println("You have accumulated " + points + " points");
        }else{
            System.out.println("Dear driver, please turn on the train before trying to move");
        }
        return points;
    }

    public void stopTrain(){
        if(mainWagon.getIsOn()){
            System.out.println("STOPPING...");
            System.out.println("The train has stopped");
        }else{
            System.out.println("Dear driver, please turn the train on first and start moving");
        }
    }

    public void whistle(){
        if(mainWagon.getIsOn()){
            System.out.println("PEEEEEP PEEEEEP!!");
        }else{
            System.out.println("Dear driver, please turn the train on first");
        }
    }

    public void turn(){
        if(mainWagon.getIsOn()){
            mainWagon.setOn(false);
            System.out.println("Turning off train...");
            System.out.println("The train is off");
        }else{
            mainWagon.setOn(true);
            System.out.println("Turning on train...");
            System.out.println("The train is on");
        }
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }
    
}
