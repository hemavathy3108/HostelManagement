package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Allocation;

public class AllocationDAO {

    public void allocateRoom(Allocation allocation){

        try{

            Connection conn=DBConnection.getConnection();

            String sql="INSERT INTO allocation(student_id,room_id) VALUES(?,?)";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setInt(1,allocation.getStudentId());
            ps.setInt(2,allocation.getRoomId());

            ps.executeUpdate();

            System.out.println("Room Allocated Successfully");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
