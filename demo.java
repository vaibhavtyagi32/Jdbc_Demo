import java.sql.*;
public class demo {
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
     private static final String password="9899552393";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
//            String query=String.format("INSERT INTO student(name,marks,phone) VALUES ('%s',%o,%o)", "karan",87,3434343);
//            String query=String.format("UPDATE student SET marks=%o WHERE id=%o",76,4);
            String query="DELETE FROM student WHERE ID= 4";
            int rowsAffected=statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("Data DELETED successfully!");
            }
            else{
                System.out.println("Data not DELETED");
            }
//            ResultSet resultset=statement.executeQuery(query);
//            while(resultset.next())
//            {
//                int id=resultset.getInt("id");
//                String name=resultset.getString("name");
//                int marks=resultset.getInt("marks");
//                int phone=resultset.getInt("phone");
//                System.out.println("ID : "+id);
//                System.out.println("NAME : "+name);
//                System.out.println("MARKS : "+marks);
//                System.out.println("PHONE : "+phone);
//            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
