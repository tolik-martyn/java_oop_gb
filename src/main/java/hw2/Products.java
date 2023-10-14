package hw2;

public class Products {

    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrise() {
        return this.price;
    }

    @Override
    public String toString() {
        return "name: " + name + ", price: " + price;
    }
}
