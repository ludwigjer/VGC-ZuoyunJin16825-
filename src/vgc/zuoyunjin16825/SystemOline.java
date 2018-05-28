/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc.zuoyunjin16825;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ludwig
 */
public class SystemOline implements ProgramInterface{
    public static void getConnection(){
        try{
            //1.Get a connection to database
             String dbUrl="jdbc:mysql://localhost:3306/vgc?useSSL=false";
             String userid="root";
             String userps="P6agztsg";
             Connection myConn = DriverManager.getConnection(dbUrl,userid,userps);
            //2.Create a statement
             Statement myStmt = myConn.createStatement();
            //3.Execute SQL query          
            ResultSet myRs = myStmt.executeQuery("select * from Student");
            //4.Process the result set 
             
              while (myRs.next()){
              System.out.println("Student ID: "+myRs.getString("StudentID")+"  ,Student first name: "+myRs.getString("StudentFName")+"  ,Student last name: "+myRs.getString("StudentLName")+"  ,Address: "+myRs.getString("Address")+"  ,PhoneNumber: "+myRs.getString("PhoneNumber")+"  ,EnrollmenttDate: "+myRs.getString("EnrollmenttDate"));
              }  
        }
        catch(Exception exc){
            exc.printStackTrace();
        }       
}
     public void refreshTableData(){};
}
