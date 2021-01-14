package Connection;
import java.sql.*;

public class MyCon {
   static Connection con=null;

    public static Connection getConnection()
    {
       try {
       
      // Class.forName("Con.mysql.jdbc.Driver");  wrong code
         Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver load Succesfully");
        
      con=DriverManager.getConnection("jdbc:Mysql://localhost:3306/vote","root","root");
      System.out.println("DataBase connected");
             
                   }
  catch(Exception e)
  {
      
      System.out.println(e);
      
  }
      return con;         
    }     
}

