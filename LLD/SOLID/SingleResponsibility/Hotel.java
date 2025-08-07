public class Hotel {
    private String name;
    private String address;
    private String hotelType;
    private int roomsCount;

    public Hotel(String name, String address, String hotelType, int roomsCount) {
        this.name = name;
        this.address = address;
        this.hotelType = hotelType;
        this.roomsCount = roomsCount;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getHotelType() { return hotelType; }
    public int getRoomsCount() { return roomsCount; }
}
