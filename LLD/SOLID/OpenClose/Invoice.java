package SOLID.OpenClose;

public class Invoice {
    private InvoiceStrategy strategy;

    public Invoice(InvoiceStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateInvoice(Product[] products, double amount) {
        strategy.generateInvoice(products, amount);
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
