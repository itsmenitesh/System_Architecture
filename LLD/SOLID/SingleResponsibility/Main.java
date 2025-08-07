public class Main {
    public static void main(String args[]) {
        // Create hotel
        Hotel hotel = new Hotel("Sunrise Inn", "123 Main St", "Luxury", 50);

        // Create customer
        CustomerProfile customer = new CustomerProfile("Nitesh", "choudhary127@email.com", "1234567890");

        // Room booking
        RoomBooking roomBooking = new RoomBooking();
        int roomNumber = 101;
        if (roomBooking.bookRoom(roomNumber)) {
            // Payment processing
            PaymentProcessor paymentProcessor = new PaymentProcessor();
            paymentProcessor.processPayment(customer.getName(), 1000);
        }
    }
}
