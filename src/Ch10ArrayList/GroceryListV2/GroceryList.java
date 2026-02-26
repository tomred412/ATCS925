package Ch10ArrayList.GroceryListV2;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<GroceryItemOrder> Groceries;

    public GroceryList() {
        Groceries = new ArrayList<GroceryItemOrder>();
    }

    public void addItem(GroceryItemOrder item) {
        Groceries.add(item);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (var it : Groceries) {
            total += it.getCost();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    public String toString() {
        String output = "Your grocery list:\n\n";
        for (var it : Groceries) {
            output += it;
        }
        output += "\nTotal cost: $" + getTotalCost();
        return output;
    }
}
