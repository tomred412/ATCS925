package Ch10ArrayList.HotelReservationSystem;

import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;
    private ArrayList<String> waitList;

    public Reservation requestRoom(String guestName) {
        for (int i = 0; i < rooms.length; ++i) {
            if (rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }

    public Reservation cancelAndReassign(Reservation res) {
        if (waitList.isEmpty()) {
            rooms[res.getRoomNumber()] = null;
            return null;
        } else {
            rooms[res.getRoomNumber()] = new Reservation(waitList.get(0), res.getRoomNumber());
            waitList.remove(0);
            return rooms[res.getRoomNumber()];
        }
    }
}
