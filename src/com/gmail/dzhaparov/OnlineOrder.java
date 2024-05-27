package com.gmail.dzhaparov;

public class OnlineOrder {
    public static void main(String[] args) {
        int orderNumber;
        String clientName;
        String product;
        String currency;
        double price;
        String address;

        orderNumber = 1;
        clientName = "Alice";
        product = "smartphone";
        currency = "EUR";
        price = 305.99;
        address = "Moon Street, 10";

        System.out.println("Order No " + orderNumber + " Client: " + clientName + ".\n" +
                "Product: " + product + ",\n" +
                "price " + currency + " " + price + ".\n" +
                "Address: " + address + ".");

        orderNumber = 2;
        clientName = "Tom";
        product = "laptop";
        currency = "EUR";
        price = 570.95;
        address = "Terra Street, 17";


        System.out.println("Order No " + orderNumber + " Client: " + clientName + ".\n" +
                "Product: " + product + ",\n" +
                "price " + currency + " " + price + ".\n" +
                "Address: " + address + ".");

    }


}
