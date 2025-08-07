package SOLID.OpenClose;

public interface InvoiceStrategy {
    void generateInvoice(Product[] products, double amount);
}

class DetailedInvoiceStrategy implements InvoiceStrategy {
    @Override
    public void generateInvoice(Product[] products, double amount) {
        System.out.println("Invoice Date: " + java.time.LocalDate.now());
        System.out.println("-------------------------------");
        System.out.println("Product Name\tPrice");
        for (Product product : products) {
            System.out.println(product.getName() + "\t\t" + product.getPrice());
        }
        System.out.println("-------------------------------");
        System.out.println("Total: " + amount);
    }
}
