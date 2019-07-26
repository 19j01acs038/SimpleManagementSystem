
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class DBConnection {
           //create the connection host here
    String host="jdbc:mySql://localhost:3306/Management";
    String user="root";
    String pass="";
    //dclare connect object 
    Connection conn;
    
    //initialize the connection object
    public Connection getConnection(){
        try{
          conn=DriverManager.getConnection(host,user,pass);
          //JOptionPane.showMessageDialog(null,"connection Successive" );
          return conn;
        }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ""+ex.getMessage());
           return null;
       }
    }
    //insert the employee record
        public void insertEmployee(String Empid,String empfname, String emplname, String empg, String empmarital, String empcount,String EmpSelect,String empSalary){
        String q="INSERT INTO employee(EmpIoyeeid,EmployeeFirstName,EmployeeLastname,Gender,EmployeeMarital,EmployeeCountry,SelectTypeOfEmployee,MonthlySalary)VALUES(?,?,?,?,?,?,?,?)";
        
        try{
            int k=0;
        PreparedStatement st=getConnection().prepareStatement(q);
        st.setString(1,Empid);
        st.setString(2,empfname);
        st.setString(3,emplname);
        st.setString(4,empg);
        st.setString(5,empmarital);
        st.setString(6,empcount);
        st.setString(7,EmpSelect);
        st.setString(8,empSalary);
        
        
        if(st.executeUpdate()>k){
            JOptionPane.showMessageDialog(null, Empid +" registered successfully");
        }
    }
    catch(SQLException x){
    JOptionPane.showMessageDialog(null,x.getMessage());
}
    }
       
        // defines how delete can be done
        public void deleteemployee(String EmpID){
            String q="DELETE FROM employee WHERE EmpIoyeeid=?";
            try
            {
                int k=0;
                PreparedStatement st=getConnection().prepareStatement(q);
                st.setString(1, EmpID);
                 if(st.executeUpdate()>k){
                    JOptionPane.showMessageDialog(null,EmpID+"record deleted successively");
                    
                 }
            }
            catch(SQLException x){
                JOptionPane.showMessageDialog(null, x.getMessage());
            }
           
            //defines how update can be done
        }
        public void updateEmployee(String Empid,String EmpfName,String EmplName,String Empg,String EmpMarital,String EmpCount,String EmpSelect,String empSalary){
            String q="UPDATE employee SET EmployeeFirstName=?,EmployeeLastName=?,Gender=?,EmployeeMarital=?,EmployeeCountry=?,SelectTypeOfEmployee=?,MonthlySalary=? WHERE EmpIoyeeid=?";
            {
                try
                {
                    int k=0;
                    PreparedStatement st=getConnection().prepareStatement(q);
               
                st.setString(1,EmpfName);
                st.setString(2,EmplName);
                st.setString(3,Empg);
                st.setString(4,EmpMarital);
                st.setString(5,EmpCount);
                 st.setString(6,Empid);
                 st.setString(7,EmpSelect);
                 st.setString(8,empSalary);
                    
                    
                     if(st.executeUpdate()>k){
                    JOptionPane.showMessageDialog(null, Empid+"Employee record updated");
                }
       
            }
                 catch(SQLException x){
                JOptionPane.showMessageDialog(null, x.getMessage());
        } 
            }
        }
            //show how reteieve can be done
            public ResultSet getEmployees(){
            
                String q="SELECT *FROM employee";
                try{
                    Statement st=getConnection().createStatement();
                    ResultSet rs=st.executeQuery(q);
                    return rs;
                }
                catch(SQLException x){
                    JOptionPane.showMessageDialog(null,x.getMessage());
                    return null;
                }
                
            }
    
}
