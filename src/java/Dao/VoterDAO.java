/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connection.MyCon;
import Model.Voter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Abhishek
 */
public class VoterDAO {

   public boolean UpdateVoterNumber(String voterid) throws Exception
   {
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
   String sql;
   con=MyCon.getConnection();
   sql="update user set votevalue='1' where voterid="+voterid;
   ps=con.prepareStatement(sql);
     if(ps.executeUpdate()>0)
        return true;
     else 
         return false;
   
   }
    
    
    
   public Voter searchByVoterId(String voterid) throws Exception
   {
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
   String sql;
   con=MyCon.getConnection();
   sql="select * from user where voterid='"+voterid+"'";
   ps=con.prepareStatement(sql);
   
   rs=ps.executeQuery();
  
   Voter v= new Voter();
   if(rs.next())
   {
    v.setVoterid(rs.getString(1));
    v.setAadhar(rs.getLong(2));
    v.setName(rs.getString(3));
    v.setEmail(rs.getString(4));
    v.setGender(rs.getString(5));
    v.setState(rs.getString(6));
    v.setCity(rs.getString(7));
    v.setMobile(rs.getLong(8));
    v.setAddress(rs.getString(9));
    v.setVotevalue(rs.getInt(10));
           return v;
   }
 else
       return v=null;
       
   
   }
    
    
    
    
    public boolean loginByAadhar(String voterid,long aadhar)  throws Exception
    {
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
   String sql;
   con=MyCon.getConnection();
   sql="select * from user where voterid='"+voterid+"' and aadhar='"+aadhar+"'";
   ps=con.prepareStatement(sql);
   rs=ps.executeQuery();
       if(rs.next())
    {
      return true;
    }
    return false;
    }
    
    
    
    public boolean insertVoter(Voter v) throws Exception
    {
    Connection con=null;
        PreparedStatement ps=null;
     con=MyCon.getConnection();
        String sql=null;
         sql="insert into user values(?,?,?,?,?,?,?,?,?,?)";
    ps=con.prepareStatement(sql);
    ps.setString(1,v.getVoterid());
    ps.setLong(2,v.getAadhar());
    ps.setString(3,v.getName());
    ps.setString(4,v.getEmail());
     ps.setString(5,v.getGender());
     ps.setString(6,v.getState());
     ps.setString(7,v.getCity());
     ps.setLong(8,v.getMobile());
     ps.setString(9,v.getAddress());
    ps.setInt(10,v.getVotevalue());
   
   if(ps.executeUpdate()>0)
   { return true;
   }
  
   return false;
    }
    
    
    
}
