package service;

import dao.RoomDAO;
import model.Room;

public class RoomService {

    RoomDAO dao=new RoomDAO();

    public void addRoom(int number,int capacity){

        Room room=new Room(number,capacity);

        dao.addRoom(room);
    }
}