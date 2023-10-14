package hw1;

public class Cars {

    /**
     * Напишите класс Car.
     * В классе должна храниться следующая информация:
     * название автомобиля - model;
     * год выпуска - year;
     * стоимость - price;
     * цвет - color;
     * объем двигателя - power.
     */

    /**
     * Доработайте класс Car.
     * В классе должна храниться следующая информация:
     * Свойство - которое говорит заведен авто или нет
     * Метод - запуска автомобиля
     * Метод - остановки автомобиля
     * Метод дороги - при вызове, в качестве аргумента передаем место назначения
     * И если авто заведён - выводим, что мы на такой-то авто едем место назначения
     * Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
     */

    enum Status {
        On, Off
    }

    private String model;
    private int year;
    private double price;
    private String color;
    private double power;
    private Status status;
    private int mileage;

    public Cars(String model, int year, double price, String color, double power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = Status.Off;
        this.mileage = 0;
    }

    public String getInfo() {
        return String.format("model: %s; year: %d; price: %.2f; color: %s; power: %.1f", model, year, price, color,
                power);
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int dist) {
        this.mileage += dist;
    }

    public void powerButton() {
        if (this.status == Status.Off) {
            this.powerOn();
            this.status = Status.On;
        } else {
            this.powerOff();
            this.status = Status.Off;
        }
    }

    private void powerOn() {
        System.out.println("Car started");
    }

    private void powerOff() {
        System.out.println("Car stopped");
    }

    public void road(String adress) {
        if (this.status == Status.Off) {
            System.out.printf("Автомобиль %s не заведен, и мы не можем ехать\n", model);
        } else {
            System.out.printf("Мы на автомобиле %s, и едем по адресу: %s\n", model, adress);
        }
    }
}
