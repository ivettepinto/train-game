public class MainWagon extends Wagon {
    private boolean isOn;
    private int power;

    public MainWagon(boolean isOn, int power) {
        this.isOn = isOn;
        this.power = power;
    }


    @Override
    public String getWagonType(){
        return "main";
    }
    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    
    
}
