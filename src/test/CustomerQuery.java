/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munir
 */
public class CustomerQuery {
    
    public ArrayList<Customer> CustomerList(){
        
        ArrayList<Customer> blist = new ArrayList<Customer>();
        
        Connection con = ConnectionDB.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        
        try {
            ps=con.prepareStatement("SELECT * from Customer");
            //rs = st.executeQuery("SELECT `Topic`, `Description`, `Date & Time`, `stid`, `Tid`, `Course Name` FROM `bookings` WHERE stid= "+stid);
            //ps.setString(1,stid );
            rs=ps.executeQuery();
      
            
            
            Customer b;
            
            while(rs.next()){
                b= new Customer( 
                        rs.getInt("CID"), 
                        rs.getString("CNAME"),
                        rs.getString("CEmail"),
                        rs.getString("CPhone"),
                        rs.getString("CAddress"),
                        rs.getInt("BillingDate"),
                        rs.getInt("package"),
                        rs.getString("AccountStatus"),
                        rs.getInt("balance"));
                blist.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return blist;
    }
    
    public ArrayList<Customer> SearchCustomer(String a){
        
        ArrayList<Customer> blist = new ArrayList<Customer>();
        
        Connection con = ConnectionDB.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        
        try {
            ps=con.prepareStatement("SELECT * from Customer WHERE CName LIKE ? ");
            ps.setString(1,"%"+a+"%" );
            System.out.println(a);
            rs=ps.executeQuery();
      
            
            
            Customer b;
            
            while(rs.next()){
                b= new Customer( 
                        rs.getInt("CID"), 
                        rs.getString("CNAME"),
                        rs.getString("CEmail"),
                        rs.getString("CPhone"),
                        rs.getString("CAddress"),
                        rs.getInt("BillingDate"),
                        rs.getInt("package"),
                        rs.getString("AccountStatus"),
                        rs.getInt("balance"));
                blist.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return blist;
    }
}
