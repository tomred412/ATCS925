package Ch8ClassesAndObjects.GroceryList;

import java.util.Arrays;

public class GroceryList {

    private GroceryItemOrder Groceries[];
    private int numItems;

    public GroceryList() {
        Groceries = new GroceryItemOrder[10];
        numItems = 0;
    }

    public void addItem(GroceryItemOrder item) {
        Groceries[numItems] = item;
        ++numItems;
    }

    public double getTotalCost() {
        double total = 0.0;
        for (int i = 0; i < numItems; ++i) {
            total += Groceries[i].getCost();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    public String toString() {
        String output = "Your grocery list:\n\n";
        for (int i = 0; i < numItems; ++i) {
            output += Groceries[i];
        }
        output += "\nTotal cost: $" + getTotalCost();
        return output;
    }
}
