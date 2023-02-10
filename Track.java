public class Track {
    private int lanes;
    private Train train;

    
    public Track(int lanes, Train train) {
        this.lanes = lanes;
        this.train = train;
    }
    public int getLanes() {
        return lanes;
        
    }
    
    public void setLanes(int lanes) {
        this.lanes = lanes;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }

    


}