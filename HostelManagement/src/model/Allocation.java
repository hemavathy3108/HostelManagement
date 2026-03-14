package model;

public class Allocation {

    private int allocationId;
    private int studentId;
    private int roomId;

    public Allocation(){}

    public Allocation(int studentId, int roomId){
        this.studentId = studentId;
        this.roomId = roomId;
    }

    public int getAllocationId(){
        return allocationId;
    }

    public void setAllocationId(int allocationId){
        this.allocationId = allocationId;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getRoomId(){
        return roomId;
    }

    public void setRoomId(int roomId){
        this.roomId = roomId;
    }
}