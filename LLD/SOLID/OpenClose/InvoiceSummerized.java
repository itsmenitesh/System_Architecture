package SOLID.OpenClose;

public class InvoiceSummerized implements InvoiceStrategy {
    private int linesToSummarize;

    public InvoiceSummerized(int linesToSummarize) {
        this.linesToSummarize = linesToSummarize;
    }

    @Override
    public void generateInvoice(Product[] products, double amount) {
        System.out.println("Summarized Invoice for " + Math.min(products.length, linesToSummarize) + " products (showing up to " + linesToSummarize + "):");
        for (int i = 0; i < Math.min(products.length, linesToSummarize); i++) {
            System.out.println(products[i].getName() + "\t" + products[i].getPrice());
        }
        System.out.println("-------------------------------");
        System.out.println("Total: " + amount);
    }
}