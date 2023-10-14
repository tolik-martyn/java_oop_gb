package hw2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Products> list = new ArrayList<>();
    private int maxCount;

    public VendingMachine(List<Products> list, int maxCount) {
        this.list = list;
        this.maxCount = maxCount;
    }

    public VendingMachine(int maxCount) {
        this.maxCount = maxCount;
    }

    public void addProduct(Products goods) {
        if (this.list.size() < maxCount) {
            this.list.add(goods);
        } else {
            System.out.println("Vending machine is full, you cannot add products");
        }
    }

    public Products getProductByName(String name) throws Exception {
        for (Products goods : list) {
            if (goods.getName().equals(name)) {
                var result = goods;
                list.remove(goods);
                return result;
            }
        }
        throw new Exception("We didn't find anything");
    }

    public Products getProductByCost(double price) throws Exception {
        for (Products goods : list) {
            if (goods.getPrise() == price) {
                var result = goods;
                list.remove(goods);
                return result;
            }
        }
        throw new Exception("We didn't find anything");
    }
}
