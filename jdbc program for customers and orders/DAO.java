
package COPackage;
import java.sql.*;
import java.util.*;

public class DAO 
{
   



 

    private Connection connect() throws Exception
    {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Customers and orders",
            "postgres",
            "meenakshi"
        );
    }

    // INSERT CUSTOMER
    public void insertCustomer(CustomerModel c) throws Exception
    {
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO customer VALUES (?,?,?,?,?)"
        );

        ps.setInt(1, c.getCustomerId());
        ps.setString(2, c.getCustName());
        ps.setString(3, c.getCity());
        ps.setInt(4, c.getGrade());
        ps.setInt(5, c.getSalesmanId());

        ps.executeUpdate();
    }

    // INSERT ORDER
    public void insertOrder(OrdersModel o) throws Exception
    {
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO orders VALUES (?,?,?,?,?)"
        );

        ps.setInt(1, o.getOrdNo());
        ps.setDouble(2, o.getPurchAmt());
        ps.setDate(3, java.sql.Date.valueOf(o.getOrdDate()));
        ps.setInt(4, o.getCustomerId());
        ps.setInt(5, o.getSalesmanId());

        ps.executeUpdate();
    }

    // SELECT FILTER
    public List<ResultModel> getFilteredOrders(double min, double max) throws Exception
    {
        List<ResultModel> list = new ArrayList<>();
        Connection con = connect();

        String sql = "SELECT o.ord_no, o.purch_amt, c.cust_name, c.city " +
                     "FROM orders o JOIN customer c " +
                     "ON o.customer_id = c.customer_id " +
                     "WHERE o.purch_amt BETWEEN ? AND ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, min);
        ps.setDouble(2, max);

        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
            list.add(new ResultModel(
                rs.getInt(1),
                rs.getDouble(2),
                rs.getString(3),
                rs.getString(4)
            ));
        }

        return list;
    }
}

