import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class inserttable {
    public static void main(String[] args) throws Exception {
        String name1="kamal";
        String email1="kamal763@gmail.com";
        String pass1="9862";
        String gen1="male";
        String city1="haderabad";
        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("driver class loaded successfully");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_insert","root","9899552393");
//        System.out.println("Successfully connection created");
//       PreparedStatement ps= con.prepareStatement("insert into register values('vaibhav','vaibhav@gmail.com','abcd','male','ghaziabad')");
        PreparedStatement ps= con.prepareStatement("insert into register values(?,?,?,?,?)");
        ps.setString(1,name1);
        ps.setString(2,email1);
        ps.setString(3,pass1);
        ps.setString(4,gen1);
        ps.setString(5,city1);

       int i=ps.executeUpdate();
       if(i>0) {
           System.out.println("success");
       }
       else{
           System.out.println("fail");
       }
    }
}
