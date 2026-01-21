/**
  * H0P2.java
  * 
  * This program calculates the total cost, commissions, and
  * net profit or loss from Tom's stock transaction.
  * 
  * Author: Nour Elgohary
  * Version: 1.0 
 */

public class H0P2 {

    /**
      * Calculates and prints the purchase amount, commissions, 
      * sale amount, and Tom's net profit.
      * 
      */

    public static void main(String[] args) {

        // Purchase details
        int sharesPurchased = 1000;
        double purchasePricePerShare = 32.87;
        double commissionRate = 0.02;

        // Sale details
        int sharesSold = 1000;
        double salePricePerShare = 36.92;

        // Calculations for purchase
        double purchaseTotal = sharesPurchased * purchasePricePerShare;
        double purchaseCommission = purchaseTotal * commissionRate;
        double totalPurchaseCost = purchaseTotal + purchaseCommission;

        // Calculations for sale
        double saleTotal = sharesSold * salePricePerShare;
        double saleCommission = saleTotal * commissionRate;
        double totalSaleRevenue = saleTotal - saleCommission;

        // Net profit
        double netProfit = totalSaleRevenue - totalPurchaseCost;

        // Output Results
        System.out.printf("Total amount paid for the stock was: $%.2f%n", purchaseTotal);
        System.out.printf("The amount of commission paid on purchase transaction was: $%.2f%n", purchaseCommission);
        System.out.printf("Tom sold the stock for: $%.2f%n", saleTotal);
        System.out.printf("The amount of commission paid on sale transaction was: $%.2f%n", saleCommission);
        System.out.printf("Tom's net profit is: $%.2f%n", netProfit);


    }
}
