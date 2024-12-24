import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class fetch {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_insert","root","9899552393");
        PreparedStatement ps=con.prepareStatement("select * from register");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            String name1=rs.getString("name");
            String email1=rs.getString("email");
            String pass1=rs.getString("password");
            String gen1=rs.getString("gender");
            String city1=rs.getString("city");
            System.out.println("Name : "+name1);
            System.out.println("Email : "+email1);
            System.out.println("Password : "+pass1);
            System.out.println("Gender : "+gen1);
            System.out.println("City : "+city1);
            System.out.println("--------------------------------------------------------------------------------");

        }
        con.close();
    }
}
