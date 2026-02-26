package Ch8ClassesAndObjects.GroceryList;

public class GroceriesClient {
    public static void main(String[] args) {
        GroceryList my_groceries = new GroceryList();
        GroceryItemOrder milk = new GroceryItemOrder("Milk", 1, 2.39);
        my_groceries.addItem(milk);
        GroceryItemOrder eggs = new GroceryItemOrder("Eggs", 12, .37);
        my_groceries.addItem(eggs);
        GroceryItemOrder cloves = new GroceryItemOrder("Cloves", 5, .07);
        my_groceries.addItem(cloves);
        GroceryItemOrder vanilla = new GroceryItemOrder("Vanilla", 1, 4.25);
        my_groceries.addItem(vanilla);
        GroceryItemOrder white_sugar = new GroceryItemOrder("White Sugar", 3, 1.35);
        my_groceries.addItem(white_sugar);
        GroceryItemOrder light_cream = new GroceryItemOrder("Light Cream", 1, 7.50);
        my_groceries.addItem(light_cream);
        GroceryItemOrder nutmeg = new GroceryItemOrder("Nutmeg", 1, 3.65);
        my_groceries.addItem(nutmeg);
        System.out.println(my_groceries);
    }
}
