package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {

    StudentDAO dao=new StudentDAO();

    public void registerStudent(String name,String course){

        Student s=new Student(name,course);

        dao.addStudent(s);
    }
}