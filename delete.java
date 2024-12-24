import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete {
    public static void main(String[] args) throws  Exception{
        String email1="atul123@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_insert","root","9899552393");
        PreparedStatement ps=con.prepareStatement("delete from register where email=?");
        ps.setString(1,email1);
        int count=ps.executeUpdate();
        if(count>0){
            System.out.println("success");
        }
        else {
            System.out.println("fail");
        }
    }
}
