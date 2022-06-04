import java.sql.*;
import java.io.*;

class DynamicUpdate
{
    public static void main(String args[])
    {
        try{
            //load the Driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
          String url = "jdbc:mysql://localhost:3360/youtube";
          String userName = "root";
          String password = "root";


           // creating the connection'
            Connection con = DriverManager.getConnection(url,userName,password);
             
             String q = "insert into table1(tName,tCity) values (?,?)";

              PreparedStatement prst = con.prepareStatement(q);
               BufferedReader  br =new BufferedReader(new InputStreamReader(System.in)); 
               System.out.println("Enter your name ");
               String name = br.readLine();
               System.out.println("Enter city name ");
              String city = br.readLine();

              prst.setString(1,name);
              prst.setString(2,city);


               prst.executeUpdate();
               System.out.println("table created");
               con.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}