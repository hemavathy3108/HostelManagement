package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Room;

public class RoomDAO {

    public void addRoom(Room room){

        try{

            Connection conn=DBConnection.getConnection();

            String sql="INSERT INTO rooms(room_number,capacity) VALUES(?,?)";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setInt(1,room.getRoomNumber());
            ps.setInt(2,room.getCapacity());

            ps.executeUpdate();

            System.out.println("Room Added");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}