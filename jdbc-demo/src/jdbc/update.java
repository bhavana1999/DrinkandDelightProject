package jdbc;


import java.sql.*;

import java.util.Scanner;


public class update {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String user="scott";
String password="tiger";
try {
Connection con=DriverManager.getConnection(url,user,password);
System.out.println("connection succesful");

//create statement
PreparedStatement psmt=con.prepareStatement("update bvrit_student set age=? where roll=?");
int age; 
int roll;
System.out.println("Enter roll:");
roll=in.nextInt();
System.out.println("Enter new age:");
age=in.nextInt();

//set the parameters
psmt.setInt(2, roll);
psmt.setInt(1, age);

//execute update
int r=psmt.executeUpdate();

//Processing ResultSet
if(r>0) {
System.out.println("Updated Succesfully");
}
else {
System.out.println("Failed ");
}
}catch(SQLException e) {
e.printStackTrace();
}

}
}
