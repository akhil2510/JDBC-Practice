import java.sql.*;


class InsertJDBC
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
             
             String q = "create table table1(tID int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";

              Statement stmt = con.createStatement();
               stmt.executeUpdate(q);
               System.out.println("table created");
               con.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}