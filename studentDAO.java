import java.sql.*;
public class studentDAO {
    public void addstudent(Student student)
    {
        String sql="INSERT INTO STUDENT values(?,?,?,?)";
        try(Connection con=DBconnection.getConnection();
             PreparedStatement ps=con.prepareStatement(sql))
             {
                ps.setInt(1, student.getID());
                ps.setInt(2, student.getName());
                ps.setInt(3, student.getAge());
                ps.setInt(4, student.getBranch());
                ps.setString(5,student,getphone());
                int rows=ps.executeUpdate();
                if(rows>0)
                     {
                    System.out.println("student added successfully");
                    } 
              }
             catch(SQLException e) 
             {
               System.out.println("Error:"+e.getMessage());
             }
    }
    public void viewstudent() {
        String sql="SELECT * FROM Students";
        try(Connection con=DBConnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql)) {
                System.out.println("\nID\tName\tAge\tBranch\tphone");
                System.out.println("--------------------------------");
                while(rs.next()) 
                    {
                System.out.println(rs.getInt("id")+
                "\t"+rs.getString("name")+"\t"
                +rs.getInt("age")+"\t"
                +rs.getString("branch")+"\t"
                +rs.getstring("phone"));                               
            }
            }
    }
    Catch(SQLException e){
        System.out.println("Error:"+e.getMessage());
    }
public void searchstudent(int id) {
    String sql="SELECT * FROM students where id=?";
    try(Connection con=DBconnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql)) {
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        if(rs.next()) 
        {
            System.out.println("\n student Found");
            System.out.println("ID:"+rs.getInt("id"));
            System.out.println("Name:"+rs.getstring("name"));
            System.out.println("Age:"+rs.getInt("age"));
            System.out.println("Branch:"+rs.getInt("branch"));
            System.out.println("Phone:"+rs.getInt("phone"));
        }
        else 
            {
            System.out.println("student not found");
            }
       }
      catch (SQLException e) 
      {
        System.out.println("Error:"+e.getMessage());
      }
        }
        public void updatestudent(Student student) 
        {
            String sql="UPDATE students SET name=?,age=?,branch=?,phone=? WHERE id=?";
            try(Connection con=DBconnection.getConnection();
                PreparedStatement ps=con.prepareStatement(sql())) 
                {
                    ps.setInt(1,id);
                    int rows=ps.executeUpdate();
                    if(row>0) {
                        System.out.println("student deleted successfully");
                    }
                    else {
                        System.out.println("student ID not found");
                    }
                }
                catch (SQLException e) 
                {
                    System.out.println("Error"+e.getMessage());
                }
        }
        public void deletestudent(int id) {
            String sql="DELETE FROM students where id=?";
            try(Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql))
            {
                ps.setInt(1,id);
                int rows=ps.executeUpdate();
                if(rows>0){
                    System.out.println("student deleted successfully");
                }
                else{
                    System.out.println("student ID not found");
                }
            }
              catch(SQLException e) {
                System.out.println("Error"+e.getMessage());
              }
                
    

        }
}

