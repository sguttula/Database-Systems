/*
Sudarshan Guttula
Andres Lopez-Ruiz
*/

import java.sql.*;
 
public class Project {   
   public static void main(String[] args) {
  String dept;
  String professor; //faculty
  String project;
  String graduate; //student
  String co_investigator; //references faculty
  String r_assistant;	//references graduate students
  String chairman; 
//faculty attributes
  int ssn;
  String name, 
  int age; 
  String gender;
  int rank; 
  String specialty;
  int dept_no;
//project attributes
  int pid; //project number
  String sponsor;
  LocalDate start_date;
  LocalDate end_date;
  float budget;
  int p_investigator; //references faculty ssn
      try (
         Connection conn = DriverManager.getConnection(
               " ", " ", " ");  // <-- url, username, and password go here in consecutive order for Post GRE or MySQL
         Statement stmt = conn.createStatement();
      ) {

         String sqlDelete = "Delete";
         System.out.println("The SQL query is: " + sqlDelete); 
         int countDeleted = stmt.executeUpdate(sqlDelete);
         System.out.println(countDeleted + " faculty or projects deleted.\n");

         String sqlInsert = "insert into table ";
         System.out.println("The SQL query is: " + sqlInsert);  
         int countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " faculty or projects inserted.\n");

         sqlInsert = "insert into table values ";
         System.out.println("The SQL query is: " + sqlInsert); 
         countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " records inserted.\n");
 
         sqlInsert = "insert into table ";
         System.out.println("The SQL query is: " + sqlInsert);  
         countInserted = stmt.executeUpdate(sqlInsert);
         System.out.println(countInserted + " faculty or projects inserted.\n");
 
         String strSelect = "select * from table";
         System.out.println("The SQL query is: " + strSelect); 
         ResultSet rset = stmt.executeQuery(strSelect);
         while(rset.next()) {
            System.out.println(rset.getString("faculty") + ", " + rset.getDouble("project");
         }
      } catch(SQLException ex) {
         ex.printStackTrace();
      }
   }
}
