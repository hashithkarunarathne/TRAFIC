package model.db;
// Generated 21-May-2017 23:55:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PoliceStation generated by hbm2java
 */
public class PoliceStation  implements java.io.Serializable {


     private int userIdusers;
     private User user;
     private String stationName;
     private Set workingHistories = new HashSet(0);
     private Set trafficOfficers = new HashSet(0);
     private Set tickets = new HashSet(0);

    public PoliceStation() {
    }

	
    public PoliceStation(User user) {
        this.user = user;
    }
    public PoliceStation(User user, String stationName, Set workingHistories, Set trafficOfficers, Set tickets) {
       this.user = user;
       this.stationName = stationName;
       this.workingHistories = workingHistories;
       this.trafficOfficers = trafficOfficers;
       this.tickets = tickets;
    }
   
    public int getUserIdusers() {
        return this.userIdusers;
    }
    
    public void setUserIdusers(int userIdusers) {
        this.userIdusers = userIdusers;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getStationName() {
        return this.stationName;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    public Set getWorkingHistories() {
        return this.workingHistories;
    }
    
    public void setWorkingHistories(Set workingHistories) {
        this.workingHistories = workingHistories;
    }
    public Set getTrafficOfficers() {
        return this.trafficOfficers;
    }
    
    public void setTrafficOfficers(Set trafficOfficers) {
        this.trafficOfficers = trafficOfficers;
    }
    public Set getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set tickets) {
        this.tickets = tickets;
    }




}


