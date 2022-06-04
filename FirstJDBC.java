import java.sql.*;

class FirstJDBC
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
			if(con.isClosed())
			{
				System.out.println("connection is closed");

			}
			else{
				System.out.println("connection is open");
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}