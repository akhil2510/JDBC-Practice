import java.sql.*;
import java.io.*;

class SmallImageSave
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
             
             String q = "insert into  images(pic) values(?)";

              PreparedStatement prst = con.prepareStatement(q);
              FileInputStream fis =  new FileInputStream("positive vibes.jpg");  
                prst.setBinaryStream(1,fis,fis.available());
               prst.executeUpdate();
               System.out.println("Image  Inserted");
               con.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}