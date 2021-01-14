/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Abhishek
 */
public class Party {

    private int number;
    private String partyname;
    private String candidatename;
    private long tvote;

    public long getTvote() {
        return tvote;
    }

    public void setTvote(long tvote) {
        this.tvote = tvote;
    }
    
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPartyname() {
        return partyname;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }


}
