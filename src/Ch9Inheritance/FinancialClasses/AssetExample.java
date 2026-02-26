package Ch9Inheritance.FinancialClasses;

public class AssetExample {
    public static void main(String[] args) {
        Cash cash = new Cash(5000);

        Stock stock = new Stock("GOOG", 125.50);
        stock.purchase(20, 130);
        stock.purchase(10, 120);
        stock.setCurrentPrice(143);


        DividendStock divStock = new DividendStock("AAPL", 180);
        divStock.purchase(15, 190);
        divStock.payDividend(0.2);
        divStock.setCurrentPrice(192);

        MutualFund fund = new MutualFund("VTSAX", 112);
        fund.purchase(45, 110);
        fund.setCurrentPrice(115);

        System.out.println("Cash value: " + cash.getMarketValue());
        System.out.println("Stock value: " + stock.getMarketValue());
        System.out.println("Stock profit: " + stock.getProfit());
        System.out.println("Dividend stock value: " + divStock.getMarketValue());
        System.out.println("Dividend stock profit: " + divStock.getProfit());
        System.out.println("Mutual fund value: " + fund.getMarketValue());
        System.out.println("Mutual fund profit: " + fund.getProfit());
    }
}