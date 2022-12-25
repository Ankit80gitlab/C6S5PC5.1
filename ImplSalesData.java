import java.sql.*;

public class ImplSalesData {

    static Connection con;

    public static void establishconnection() throws ClassNotFoundException, SQLException
    {
        // register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Successfully");

        String user="root";
        String pass="Root";

        // establish connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC",user,pass);
        System.out.println("connection established");
    }

    public static void getData() throws SQLException
    {
        // create statement interface object
        Statement stmt = con.createStatement();

        // execute a query
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("1. Retrieve all customers details.");
        String query="select * from customer;";
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next())
        {
            int cId= rs.getInt(1);
            String fName= rs.getString(2);
            String lName= rs.getString(3);
            String city=rs.getString(4);
            int cRate=rs.getInt(5);
            int salesId=rs.getInt(6);

            Customer c = new Customer(cId,fName,lName,city,cRate,salesId);
            System.out.println(c);
        }

        // execute a query
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("2. Retrieve data of all the salespersons who work in London.");
        String query2="select s.city, s.salesId, s.firstName, s.commissionRate from salesPerson s where s.city='london';";
        ResultSet rs2 = stmt.executeQuery(query2);
        while(rs2.next())
        {
            String city= rs2.getString(1);
            int salesId= rs2.getInt(2);
            String name= rs2.getString(3);
            int com= rs2.getInt(4);

            SalesPerson s = new SalesPerson(salesId,name,city,com);
            System.out.println(s);
        }

        // execute a query
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("3. Retrieve the orders that were placed before March 31, 2021.");

        String query3="select * from Orders where ordDate < '2021-03-31'; ";
        ResultSet rs3 = stmt.executeQuery(query3);
        while(rs3.next())
        {
            int ordID = rs3.getInt(1);
            int amount= rs3.getInt(2);
            Date ordDate= rs3.getDate(3);
            int custId= rs3.getInt(4);

            Orders o = new Orders(ordID,amount,ordDate,custId);
            System.out.println(o);
        }

        // execute a query
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("4. Retrieve data of all customers who have a rating of 200.");

        String query4="select * from Customer where rating = 200;";
        ResultSet rs4 = stmt.executeQuery(query4);

        while(rs4.next())
        {
            int cId= rs4.getInt(1);
            String fName= rs4.getString(2);
            String lName= rs4.getString(3);
            String city=rs4.getString(4);
            int cRate=rs4.getInt(5);
            int salesId=rs4.getInt(6);

            Customer c = new Customer(cId,fName,lName,city,cRate,salesId);
            System.out.println(c);
        }

        stmt.close();
        con.close();

    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        establishconnection();
        getData();
    }
}
