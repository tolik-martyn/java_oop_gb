package hw3.Hw3;

public class Car extends Transport {

    private String engineType;
    private String color;
    private int passengerСapacity;

    public Car(double price, double weight, double speed, String engineType, String color, int passengerСapacity) {
        super(price, weight, speed);
        this.engineType = engineType;
        this.color = color;
        this.passengerСapacity = passengerСapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerСapacity() {
        return passengerСapacity;
    }

    public void setPassengerСapacity(int passengerСapacity) {
        this.passengerСapacity = passengerСapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "engineType=" + engineType + ", color=" + color + ", passengerСapacity="
                + passengerСapacity + ", ";
    }
}
