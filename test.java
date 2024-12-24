import java.sql.*;

public class test {
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

//            1:- Fetch data from database

//            String query="select * from student2";
//            ResultSet rs=statement.executeQuery(query);
//            while(rs.next()){
//                int id=rs.getInt("id");
//                String name= rs.getString("name");
//                int age=rs.getInt("age");
//                System.out.println("Id "+id);
//                System.out.println("Name "+name);
//                System.out.println("Age "+age);
//            }

            // 2:- Insert data into database
//            String query=String.format("INSERT INTO student2(id,name,age) values (%o,'%s',%o)",2,"bhav",14);
//            int rs=statement.executeUpdate(query);
//            if(rs>0){
//                System.out.println("'data inserted successfully");
//            }
//            else{
//                System.out.println("data not inserted");
//            }

            // 3:- update data in tables
            String query=String.format("UPDATE student2 SET age=%o where id=%o",20,2);
            int rs=statement.executeUpdate(query);
            if(rs>0){
                System.out.println("'data update successfully");
            }
            else{
                System.out.println("data not updated");
            }

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
