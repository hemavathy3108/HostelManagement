package ui;

import java.util.Scanner;
import service.StudentService;
import service.RoomService;
import service.HostelService;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        StudentService studentService=new StudentService();
        RoomService roomService=new RoomService();
        HostelService hostelService=new HostelService();

        while(true){

            System.out.println("\n--- HOSTEL MANAGEMENT ---");
            System.out.println("1 Add Student");
            System.out.println("2 Add Room");
            System.out.println("3 Allocate Room");
            System.out.println("4 Exit");

            int choice=sc.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Enter Name");
                    String name=sc.next();

                    System.out.println("Enter Course");
                    String course=sc.next();

                    studentService.registerStudent(name,course);
                    break;

                case 2:

                    System.out.println("Enter Room Number");
                    int roomNo=sc.nextInt();

                    System.out.println("Enter Capacity");
                    int cap=sc.nextInt();

                    roomService.addRoom(roomNo,cap);
                    break;

                case 3:

                    System.out.println("Enter Student ID");
                    int sid=sc.nextInt();

                    System.out.println("Enter Room ID");
                    int rid=sc.nextInt();

                    hostelService.allocateRoom(sid,rid);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}