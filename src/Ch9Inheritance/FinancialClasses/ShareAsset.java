package Ch9Inheritance.FinancialClasses;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol, double price) {
        this.symbol = symbol;
        this.currentPrice = price;
        totalCost = 0.0;
    }

    public void addCost(double cost) {
        totalCost += cost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public abstract double getMarketValue();

    public double getProfit() {
        return getMarketValue() - totalCost;
    }

    public void setCurrentPrice(double newPrice) {
        currentPrice = newPrice;
    }

    public String toString() {
        return "The market value of " + symbol + " is " + getMarketValue() + ", profit is: " + getProfit() + "\n";
    }
}