package hw2;

public class Main {
    public static void main(String[] args) {

        VendingMachine vend1 = new VendingMachine(10);
        vend1.addProduct(new Products("Snickers", 50));
        vend1.addProduct(new Products("Mars", 50));
        vend1.addProduct(new Products("Twix", 45));
        vend1.addProduct(new Products("Bounty", 45));
        vend1.addProduct(new Products("KitKat", 40));

        try {
            System.out.println(vend1.getProductByCost(50));
            System.out.println(vend1.getProductByCost(50));
            System.out.println(vend1.getProductByCost(50));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
