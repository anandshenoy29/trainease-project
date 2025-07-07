import java.sql.*;
public class Database
{
    Connection DatabaseConnection;
    Statement DatabaseStatement;
    Database()
    {
        try
        {
            DatabaseConnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainease","root","password");
            DatabaseStatement=DatabaseConnection.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Error!");
        }
    }
    public static void main(String[] args)
    {
        new Database();
    }
}