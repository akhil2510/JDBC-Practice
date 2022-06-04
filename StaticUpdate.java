import java.sql.*;


class StaticUpdate
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
               prst.setString(1,"Akhilesh");
               prst.setString(2,"toksar");
               prst.executeUpdate();
               System.out.println("table created");
               con.close();



        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}