import java.sql.*;

public class practice {
    private static final String url="jdbc:mysql://localhost:3306/varyasis";
    private static final String username="root";
    private static final String password="9899552393";
    public static void main(String[] args) {
        String email="xyz@hdhdd";
        int age=2;
        try{
            Class.forName("com.mysql.cj.mysql.Driver");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement ps=connection.prepareStatement("delete from vary  where email=?");
            ps.setString(1,email);
//            ResultSet rs=statement.executeQuery(query);
//            while(rs.next()){
//                String name1=rs.getString("name");
//                String email1=rs.getString("email");
//                int age1=rs.getInt("age");
//                System.out.println("name "+name1);
//                System.out.println("email "+email1);
//                System.out.println("age "+age1);
//            }
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("update");
            }
            else {
                System.out.println("not updated");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
