/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connection.MyCon;
import Model.Party;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhishek
 */
public class NewPartyDAO {

      
   public List<Party>searchAllParty() throws Exception
    {
         Connection con=null;
           PreparedStatement ps=null;
           
          ResultSet rs=null;
          con=MyCon.getConnection();
          String sql;
          sql="select * from partynames";
          List<Party> mylist=new ArrayList<Party>();
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          
    while(rs.next())
    {  
        Party p =new Party();
        p.setNumber(rs.getInt(1));
        p.setPartyname(rs.getString(2));
        p.setCandidatename(rs.getString(3));
        p.setTvote(rs.getLong(4));
        mylist.add(p);
       p=null;
    
    }
        return mylist;
    }
    
    
    
    
    
    
    
}
