package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Student;

public class StudentDAO {

    // CREATE
    public void addStudent(Student student) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students(name,course) VALUES(?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getCourse());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void viewStudents() {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM students";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateStudent(int id, String name) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Student Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}