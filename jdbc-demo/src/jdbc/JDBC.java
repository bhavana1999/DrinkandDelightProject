package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBC {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String user="scott";
String password="tiger";
try {

Connection con=DriverManager.getConnection(url,user,password);
System.out.println("connection succesful");
//create statement
PreparedStatement psmt=con.prepareStatement("insert into bvrit_student values(?,?,?)");

int roll,age;
String sName = null;
System.out.println("Enter roll, name, age");
roll=in.nextInt();
  sName=in.next()+in.nextLine();
  age=in.nextInt();
 
  //set the parameters
  psmt.setInt(1,roll);
  psmt.setString(2,sName);
  psmt.setInt(3,age);

//execute update
 
int r=psmt.executeUpdate();

//Processing ResultSet
if(r>0) {
System.out.println("Inserted Succesfully");
}
}catch(SQLException e) {
e.printStackTrace();
}

}

}
