package org.example;

public class Invoice {
    private int id;
    private String description;
    private double price;
    private double quantity;
    private static int invoicesCount=0;

    public Invoice(String description, double price, double quantity) {
        this.description = description;
        this.id = ++invoicesCount;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            this.price =0;
        }
        else{
            this.price = price;
        }
    }
    public int getId(){
        return id;
    }
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity<=0){
            this.quantity =0;
        }
        else{
            this.quantity = quantity;
        }
    }
    public double subtotal(){
        return quantity * price;
    }
    public double total(){
        return subtotal()+(subtotal()*(5.0/100));
    }

    public void display() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("Tax (5%): " + subtotal() * 0.05);
        System.out.println("Total: " + total());
    }

    static class Cashier {
        private String name ;

        public Cashier(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public static int getInvoices(){
            return invoicesCount;
        }
    }

}
