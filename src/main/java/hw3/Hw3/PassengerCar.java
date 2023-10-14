package hw3.Hw3;

public class PassengerCar extends Car {

    private String model;
    private int year;
    private double mileage;

    public PassengerCar(double price, double weight, double speed, String engineType, String color,
            int passengerСapacity, String model, int year) {
        super(price, weight, speed, engineType, color, passengerСapacity);
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return super.toString() + "model=" + model + ", year=" + year + ", mileage=" + mileage;
    }
}
