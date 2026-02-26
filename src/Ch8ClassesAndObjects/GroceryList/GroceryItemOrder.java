package Ch8ClassesAndObjects.GroceryList;

import java.text.DecimalFormat;

public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double ppu;

    public GroceryItemOrder(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    public double getCost() {
        return Math.round(quantity * ppu * 100.0) / 100.0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        DecimalFormat temp = new DecimalFormat("0.00");
        String s_ppu = temp.format(ppu);
        return quantity + "\t" + name + "\t$" + s_ppu + "\n";
    }
}
