package com.gmail.dzhaparov;

public class SalesSum {
    public static void main(String[] args) {
        int productNumber = 1;
        int dayNumber = 5;
        int salesNumber = 19;
        double price = 459.99;
        String currency = "EUR";
        String product = "smartphone";


        System.out.printf(
                "Product No %d: %s,\n" +
                        "total sales for %d days is %s %.2f,\n" +
                        "sales by day is %s %.2f\n",
                productNumber, product, dayNumber, currency, (salesNumber * price),
                currency, (salesNumber * price) / dayNumber
        );


        productNumber = 2;
        dayNumber = 7;
        salesNumber = 12;
        price = 1100.50;
        currency = "EUR";
        product = "laptop";


        System.out.printf(
                "Product No %d: %s,\n" +
                        "total sales for %d days is %s %.2f,\n" +
                        "sales by day is %s %.2f\n",
                productNumber, product, dayNumber, currency, (salesNumber * price),
                currency, (salesNumber * price) / dayNumber
        );
    }
}
