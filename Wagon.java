public abstract class Wagon {
    private String color;
    private float dimensions;

    public abstract String getWagonType();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getDimensions() {
        return dimensions;
    }

    public void setDimensions(float dimensions) {
        this.dimensions = dimensions;
    }

    
}
