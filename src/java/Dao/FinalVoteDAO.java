/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Connection.MyCon;
import Model.FinalVote;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Abhishek
 */
public class FinalVoteDAO {
    
    
    public boolean updatePartyVote(String party) throws Exception
    {
    Connection con;
    PreparedStatement ps;
    con=MyCon.getConnection();
    
    String sql;
    sql="update partynames set tvote=1+tvote WHERE `partyname`='"+party+"'";
       ps=con.prepareStatement(sql);
       if(ps.executeUpdate()>0)
           return true;
       else
           return false;
    
    }
    
    
    
    public boolean insertIntoFinalvote(FinalVote fv) throws Exception
    {
       
   Connection con=null;
        PreparedStatement ps=null;
      //  ResultSet rs=null;
        String sql;
    con=MyCon.getConnection();
    sql="insert into finalvote values(?,?,?,?,?)";
    
    ps=con.prepareStatement(sql);
    
    ps.setString(1,fv.getVoterid());
    ps.setLong(2,fv.getAddhar());
    ps.setString(3,fv.getName());
    ps.setString(4,fv.getPartyname());
    ps.setString(5,fv.getCandidatename());
    
    if(ps.executeUpdate()>0)
        return true;
        
    return false;
    }
}
