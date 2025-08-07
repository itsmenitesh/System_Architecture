import java.util.HashSet;
import java.util.Set;

public class RoomBooking {
    private Set<Integer> bookedRooms = new HashSet<>();

    public boolean isRoomAvailable(int roomNumber) {
        return !bookedRooms.contains(roomNumber);
    }

    public boolean bookRoom(int roomNumber) {
        if (isRoomAvailable(roomNumber)) {
            bookedRooms.add(roomNumber);
            System.out.println("Room number " + roomNumber + " is available and now booked.");
            return true;
        } else {
            System.out.println("Room number " + roomNumber + " is already booked.");
            return false;
        }
    }
}
