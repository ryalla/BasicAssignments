import java.sql.*;
public class DBConDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_assignments?user=root&password=Yalla");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
        while(rs.next()){
        	System.out.println(rs.getInt(1));
        	System.out.println(rs.getString(2));
        	System.out.println(rs.getInt(3));
        }
       con.close();
	}

}
