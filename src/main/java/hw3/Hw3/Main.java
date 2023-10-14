package hw3.Hw3;

public class Main {
    public static void main(String[] args) {

        PassengerCar car1 = new PassengerCar(10000000, 3.5, 300, "бензин", "желтый", 2, "Ferrari", 2020);

        System.out.println(car1);
        car1.setPrice(10500000); // метод setPrice(double price) из class Transport.
        car1.setColor("синий"); // метод setColor(String color) из class Car.
        System.out.println(car1.getModel()); // метод getModel() из class PassengerCar.
        System.out.println(car1);
    }
}
