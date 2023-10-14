package hw3.Hw3;

public class Transport {

    private double price;
    private double weight;
    private double speed;

    public Transport(double price, double weight, double speed) {
        this.price = price;
        this.weight = weight;
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "price=" + price + ", weight=" + weight + ", speed=" + speed + ", ";
    }
}
