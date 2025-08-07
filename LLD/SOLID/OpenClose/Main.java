package SOLID.OpenClose;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Apple", 1.5),
            new Product("Banana", 0.75),
            new Product("Orange", 1.25),
            new Product("Mango", 2.0)
        };
        double totalAmount = 0;
        for (Product p : products) {
            totalAmount += p.getPrice();
        }

        // Detailed Invoice
        InvoiceStrategy detailed = new DetailedInvoiceStrategy();
        Invoice detailedInvoice = new Invoice(detailed);
        System.out.println("--- Detailed Invoice ---");
        detailedInvoice.generateInvoice(products, totalAmount);

        // Summarized Invoice (show only 2 products)
        InvoiceStrategy summarized = new InvoiceSummerized(2);
        Invoice summarizedInvoice = new Invoice(summarized);
        System.out.println("\n--- Summarized Invoice ---");
        summarizedInvoice.generateInvoice(products, totalAmount);
    }
} 