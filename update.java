import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {
    public static void main(String[] args) throws Exception {
        String email1="kamal763@gmail.com";
        String city1="pune";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_insert","root","9899552393");
        PreparedStatement ps=con.prepareStatement("update register set city=? where email=?");
        ps.setString(1,city1);
        ps.setString(2,email1);
        int count=ps.executeUpdate();
        if(count>0){
            System.out.println("success");
        }
        else {
            System.out.println("fail");
        }

    }
}
