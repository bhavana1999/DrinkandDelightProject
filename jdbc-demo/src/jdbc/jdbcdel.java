package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcdel {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String user="scott";
String password="tiger";
try {

Connection con=DriverManager.getConnection(url,user,password);
System.out.println("connection succesful");
//create statement
PreparedStatement psmt=con.prepareStatement("delete from bvrit_student where ROLL=102");
int r=psmt.executeUpdate();
}catch(SQLException e) {
e.printStackTrace();
}

}

}


