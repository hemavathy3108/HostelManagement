package service;

import dao.AllocationDAO;
import model.Allocation;

public class HostelService {

    AllocationDAO dao=new AllocationDAO();

    public void allocateRoom(int studentId,int roomId){

        Allocation a=new Allocation(studentId,roomId);

        dao.allocateRoom(a);
    }
}