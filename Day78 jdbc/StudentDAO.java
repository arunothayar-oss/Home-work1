
package studentrecord;


    import java.sql.*;
import java.util.*;

public class StudentDAO {

    private Connection con;

    public StudentDAO() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/studentdb",
                "postgres",
                "meenakshi"   
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void insertStudent(Student s) {
        try {
            String query = "INSERT INTO student(name, marks) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getMarks());

            ps.executeUpdate();
            System.out.println("✅ Student Inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    public void displayStudents() {
        try {
            String query = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("marks")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    public void updateStudent(int id, int marks) {
        try {
            String query = "UPDATE student SET marks=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, marks);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("✅ Updated");
            else
                System.out.println("❌ Student not found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void deleteStudent(int id) {
        try {
            String query = "DELETE FROM student WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("✅ Deleted");
            else
                System.out.println("❌ Student not found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

